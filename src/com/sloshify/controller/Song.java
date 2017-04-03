package com.sloshify.controller;

public class Song {
	public String name= "UNSET";
	public int duration = -1;
	public int BPM = -1;
	
	public Song(String newName, int newDuration, int newBPM){
		name = newName;
		duration = newDuration;
		BPM = newBPM;
	}
}
