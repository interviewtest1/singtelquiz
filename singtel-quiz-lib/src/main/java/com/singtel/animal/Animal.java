package com.singtel.animal;

import org.json.JSONException;
import org.json.JSONObject;

import com.singtel.utils.Constants;
import com.singtel.utils.Constants.AnimalType;

public class Animal {
	private JSONObject content;
	
	public Animal(AnimalType type) {
		content = new JSONObject();
		setType(type);
		setProperty(Constants.AnimalAction.WALK.toString(), "I am walking");//most animals walk
	}

	public String getType() {
		return (String) getProperty(Constants.TYPE);
	}
	
	public void setType(AnimalType type) {
		setProperty(Constants.TYPE, type);
	}
	
	public void setProperty(String key, Object value) {
		content.put(key, value);
	}
	
	public void removeProperty(String key) {
		content.remove(key);
	}
	
	public Object getProperty(String key) {
		try {
			Object value = content.get(key);
			System.out.println(value);
			return value;
		}
		catch(JSONException e) {
			throw new RuntimeException(key + " not supported");
		}
	}
	
	public boolean hasProperty(String key) {
		return content.has(key);
	}
}
