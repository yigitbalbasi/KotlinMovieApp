package com.yigitbal.tvshowapp.api

import com.yigitbal.tvshowapp.helper.Constants
import com.yigitbal.tvshowapp.models.TvShowResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET(Constants.END_POINT)
    suspend fun getTvShows():Response<TvShowResponse>

}