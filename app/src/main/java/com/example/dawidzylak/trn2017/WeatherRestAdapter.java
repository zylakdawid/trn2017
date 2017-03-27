package com.example.dawidzylak.trn2017;

import retrofit2.Retrofit;


public class WeatherRestAdapter {
	public static final String BASE_URL = "http://api.myservice.com/";
	Retrofit retrofit = new Retrofit.Builder()
			.baseUrl(BASE_URL)
			.build();
	}