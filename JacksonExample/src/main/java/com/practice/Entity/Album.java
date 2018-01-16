package com.practice.Entity;

import java.util.List;

public class Album {

    private String title;
    private List<String> songs;
    private Artist artist;

    public Album(String title) {
	this.title = title;
    }

    /**
     * @return the title
     */
    public String getTitle() {
	return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
	this.title = title;
    }

    /**
     * @return the songs
     */
    public List<String> getSongs() {
	return songs;
    }

    /**
     * @param songs the songs to set
     */
    public void setSongs(List<String> songs) {
	this.songs = songs;
    }

    /**
     * @return the artist
     */
    public Artist getArtist() {
	return artist;
    }

    /**
     * @param artist the artist to set
     */
    public void setArtist(Artist artist) {
	this.artist = artist;
    }

    /**
     * @return the links
     */
}
