package com.example.dawidzylak.trn2017;

/**
 * Created by dawidzylak on 27.03.2017.
 */

import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Users {
	@GET("/data/2.5/weather")
	void getWeatherFromApi (
			@Query("q") String cityName,
			@Query("APPID") String appId,
			Callback<UsersData> callback);
	@GET("/data/2.5/weather")
	Users getWeatherFromApiSync (
			@Query("q") String cityName,
			@Query("APPID") String appId);
}