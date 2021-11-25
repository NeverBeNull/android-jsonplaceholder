package com.neverbenull.jsonplaceholder.data.paging.album

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.neverbenull.jsonplaceholder.data.remote.album.AlbumService
import com.neverbenull.jsonplaceholder.data.remote.album.model.AlbumJson
import retrofit2.HttpException
import java.io.IOException

class AlbumPagingSource constructor(
    private val albumService: AlbumService
) : PagingSource<Int, AlbumJson>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, AlbumJson> {
        try {
            // Start refresh at page 1 if undefined.
            val nextUser = params.key ?: 1
            val response = albumService.searchAlbums(nextUser)
            return LoadResult.Page(
                data = response,
                prevKey = null,
                nextKey = nextUser + 1
            )

        } catch (e: IOException) {
            // IOException for network failures.
            return LoadResult.Error(e)
        } catch (e: HttpException) {
            // HttpException for any non-2xx HTTP status codes.
            return LoadResult.Error(e)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, AlbumJson>): Int? {
        // Try to find the page key of the closest page to anchorPosition, from
        // either the prevKey or the nextKey, but you need to handle nullability
        // here:
        //  * prevKey == null -> anchorPage is the first page.
        //  * nextKey == null -> anchorPage is the last page.
        //  * both prevKey and nextKey null -> anchorPage is the initial page, so
        //    just return null.
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
    }

}