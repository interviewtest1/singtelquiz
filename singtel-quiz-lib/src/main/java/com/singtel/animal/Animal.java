package com.singtel.animal;

import org.json.JSONException;
import org.json.JSONObject;

import com.singtel.utils.Constants;

public class Animal {
	private JSONObject content;
	
	public Animal(String type) {
		content = new JSONObject();
		setType(type);
		setProperty(Constants.WALK, "I am walking");//most animals walk
	}

	public String getType() {
		return (String) getProperty(Constants.TYPE);
	}
	
	public void setType(String type) {
		setProperty(Constants.TYPE, type);
	}
	
	public void setProperty(String key, Object value) {
		content.put(key, value);
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
