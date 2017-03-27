package com.example.dawidzylak.trn2017;

/**
 * Created by dawidzylak on 27.03.2017.
 */

import java.util.List;

/**
 * {
 *   "coord":{"lon":-122.08,"lat":37.39},
 *   "sys":{
 *           "type":1,"id":451,"message":1.1091,
 *           "country":"United States of America",
 *           "sunrise":1434545231,"sunset":1434598293
 *         },
 *   "weather":[{"id":701,"main":"Mist","description":"mist","icon":"50n"}],
 *   "base":"stations",
 *   "main":{"temp":288.73,"pressure":1014,"humidity":82,"temp_min":284.26,"temp_max":294.15},
 *   "visibility":16093,
 *   "wind":{"speed":4.1,"deg":350},
 *   "clouds":{"all":20},
 *   "dt":1434517063,
 *   "id":5375480,
 *   "name":"Mountain View",
 *   "cod":200
 * }
 */
public class UsersData {
	private String id;
	private String name;
	private AcceptStatus acceptStatus;
	private Role role;
	private String photoUrl;

	public String getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public AcceptStatus getAcceptStatus(){
		return acceptStatus;
	}
	public Role getRole(){
		return role;
	}
	public String getPhotoUrl(){
		return photoUrl;
	}


	class Settings {
		boolean pushNotification;

		public Settings(){
		}
		public Settings(boolean pushNotification){
			this.pushNotification = pushNotification;
		}
		//Getters
		public boolean getPushNotifications(){
			return pushNotification;
		}

	}
	class Car{
		String model;
		String brand;
		String power;

		public Car(){
		}
		public Car(String model, String brand, String power){
			this.model = model;
			this.brand = brand;
			this.power = power;
		}
		//getters
		public String getModel(){
			return model;
		}
		public String getBrand(){
			return brand;
		}
		public String getPower(){
			return power;
		}
		//setters
	}

}