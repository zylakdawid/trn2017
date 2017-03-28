package com.example.dawidzylak.trn2017;

/**
 * Created by dawidzylak on 27.03.2017.
 */
/*
{
		"id": "58d95759699eed6185aa395a",
		"date": 1490638648000,
		"place": "Sharp latest",
		"geo": {
		"latitude": 43.2412421,
		"longitude": 23.5324234
		},
		"info": "test message latest",
		"author": "Oskar Adaszak"
		}
*/
public class SpotData {
	String id;
	String date;
	String place;
	String info;
	String author;

	public String getId(){
		return getId();
	}
	public String getDate(){
		return getDate();
	}
	public String getPlace(){
		return getPlace();
	}
	public String getInfo(){
		return getInfo();
	}
	public String getAuthor(){
		return getAuthor();
	}

	class Geo{
		String latitude;
		String longitude;

		public Geo(){
		}

		public Geo(String latitude, String longitude){
			this.latitude = latitude;
			this.longitude = longitude;
		}
		public String getLatitude(){
			return getLatitude();
		}
		public String getLongitude(){
			return getLongitude();
		}
	}
}
