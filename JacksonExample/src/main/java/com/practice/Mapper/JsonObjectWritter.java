package com.practice.Mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import java.io.IOException;


public class JsonObjectWritter {
    
    public static void writeJson(Object object, ObjectMapper om,String fileName){
	om.configure(SerializationFeature.INDENT_OUTPUT, true);
	File jsonFile = new File(fileName);
	try{
//	    Creating file and writting json
	    jsonFile.createNewFile();
	    om.writeValue(jsonFile, object);
	}catch(IOException ex){
	    System.out.println(ex.getMessage());
	}
    }
}
