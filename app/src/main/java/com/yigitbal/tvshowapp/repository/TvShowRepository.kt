package com.yigitbal.tvshowapp.repository

import com.yigitbal.tvshowapp.api.ApiService
import javax.inject.Inject

class TvShowRepository
@Inject
constructor(private val apiService: ApiService) {
    suspend fun getTvShows() = apiService.getTvShows()

}