package com.nexes.manager;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONValue;

public class Modules {

	public static JSONArray AtoJA(ArrayList<String> input) {

		JSONArray jsonAray = new JSONArray();
		if (input != null) {
			for (int i = 0; i < input.size(); i++) {
				jsonAray.add(i, input.get(i));
			}
		}

		return jsonAray;
	}

	public static ArrayList<String> JAtoA(JSONArray input) {

		ArrayList<String> output = null;

		if (input != null) {
			for (int i = 0; i < input.size(); i++) {
				output.add(input.get(i).toString());
			}
		}

		return output;

	}

	public static ArrayList<String> StoA(String input){
		
		  Object obj=JSONValue.parse(input);
		  JSONArray ja=(JSONArray)obj;
		  ArrayList<String> output =Modules.JAtoA(ja); 
		
		return output;
	}

}
