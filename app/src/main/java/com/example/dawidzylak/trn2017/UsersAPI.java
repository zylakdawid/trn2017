package com.example.dawidzylak.trn2017;

/**
 * Created by dawidzylak on 27.03.2017.
 */

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UsersAPI {
	@GET("/users")
	Call<List<UsersData>> getAllUser();
			//@Query("q") String cityName,
			//@Query("APPID") String appId,

//	@GET("/data/2.5/weather")
//	Users getWeatherFromApiSync (
//			//@Query("q") String cityName,
//			//@Query("APPID") String appId
//	);
}