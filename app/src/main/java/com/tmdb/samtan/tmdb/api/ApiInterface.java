package com.tmdb.samtan.tmdb.api;


import com.tmdb.samtan.tmdb.model.NowPlayingMovieResponse;
import com.tmdb.samtan.tmdb.model.UpcomingMovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ApiInterface {

    @GET("movie/upcoming")
    Call<UpcomingMovieResponse> getUpcomingMovies(@Query("api_key") String apiKey);

    @GET("movie/now_playing")
    Call<NowPlayingMovieResponse> getNowPlayingMovies(@Query("api_key") String apiKey);
}
