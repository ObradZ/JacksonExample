package com.practice;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.practice.Entity.Album;
import com.practice.Entity.Artist;
import com.practice.Mapper.JsonObjectReader;
import com.practice.Mapper.JsonObjectWritter;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
	
//	All needed objects
	ObjectMapper om = new ObjectMapper();
	Album album  = new Album("Parsing the JSON!");
	LocalDate ld = LocalDate.of(2009, Month.MAY, 9);
	Artist artist = new Artist();
	
//	Setting artist fields
	artist.name="Jackson";
	artist.birthDate=ld.toString();
	
//	Setting album fields
	album.setArtist(artist);
	album.setSongs(new ArrayList<String>(){{
		   add("Just parse it");
		   add("Go Json");
		   add("Json Json");
	}});
	
//	Writting json
	JsonObjectWritter.writeJson(artist, om, "album.json");

//	Reading from json
	Object album2 = (Album )JsonObjectReader.readJson(Album.class, om, "album.json");


	
	
	
	
	
    }

}
