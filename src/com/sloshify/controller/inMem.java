package com.sloshify.controller;

import java.util.*;

public class inMem implements DatabaseConfig{
	
	HashMap<String, ArrayList<Song>> songLib;
	
	public inMem(boolean withService){	
		songLib = new HashMap<String, ArrayList<Song>> ();
	}
	
	public void add(String genre, Song newSong){
		ArrayList<Song> songList;
		if(!songLib.containsKey(genre)){
			songList = new ArrayList<Song> ();
			songList.add(newSong);
			songLib.put(genre, songList);
		} else{
			songLib.get(genre).add(newSong);
		}
		
	}
	
	
	public ArrayList<Song> load(String genre){
		if(!songLib.containsKey(genre)){
			return new ArrayList<Song>();
		} else {
			return songLib.get(genre);
		}
		
	}
	
	public void delete(String genre){
		if(!songLib.containsKey(genre)){
			songLib.remove(genre);
		}
	}
}
