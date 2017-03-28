package com.example.dawidzylak.trn2017;

		import com.google.gson.Gson;
		import retrofit2.Retrofit;
		import retrofit2.converter.gson.GsonConverterFactory;

public class WeatherRestAdapter {
	public static final String BASE_URL = "http://trn.adaszakbazy.usermd.net/api";
	Retrofit retrofit = new Retrofit.Builder()
			.baseUrl(BASE_URL)
			.addConverterFactory(GsonConverterFactory.create(new Gson()))
			.build();
	}
