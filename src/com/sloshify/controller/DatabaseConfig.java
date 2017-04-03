package com.sloshify.controller;

import java.util.*;

public interface DatabaseConfig {
	
	public void add(String genre, Song newSong);
	
	public ArrayList<Song> load(String genre);
	
	public void delete(String genre);


}
