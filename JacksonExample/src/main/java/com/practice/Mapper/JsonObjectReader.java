package com.practice.Mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.practice.Entity.Album;
import java.io.File;
import java.io.IOException;


public class JsonObjectReader {
    
    public static Object readJson(Class<?> classType,ObjectMapper om,String fileName){
	try{
	return om.readValue(new File("fileName"), classType);
	
	}catch(IOException ex){
	    return null;
	}
    }

}
