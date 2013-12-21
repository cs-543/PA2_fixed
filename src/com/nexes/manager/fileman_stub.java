package com.nexes.manager;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONValue;

//import com.google.gson.Gson;

public class fileman_stub implements fileman {
	
	
	
	private ArrayList<String> populate_list(){
		return null;
		
	}

        public String searchInDirectory(String dir, String pathName) {

                // ArrayList<String> names = new ArrayList<String>();
                // search_file(dir, pathName, names);


                // return names;
           

                ArrayList<String> names = new ArrayList<String>();
                // How about Arraylist inside method
                FileManager fm = new FileManager();
                //names ?? FileManager 만들어서  poplist 실행시켜서 넣어줘야 하나?? 빈거 넣으면 됨 
                fm.search_file(dir, pathName, names);
                //String names_jsonString = new Gson().toJson(names);
                
                return Modules.AtoJA(names).toString();
                //2013.12.15 1:10
        }
}