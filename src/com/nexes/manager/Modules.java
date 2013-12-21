package com.nexes.manager;

import java.util.ArrayList;

import org.json.simple.JSONArray;

public class Modules {
	
	public static JSONArray AtoJA(ArrayList<String> input){
	
	
	
	JSONArray jsonAray = new JSONArray();
		if (input != null) { 
			   for (int i=0;i<input.size();i++){ 
				   jsonAray.add(i,input.get(i));
			   } 
			}
		
		return jsonAray;
	}
		

}
