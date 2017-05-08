package com.sloshify.controller;

public class Song {
	private String name = "New Name";
	private int duration = 0;
	private int BPM = 0;
	
	public Song (){
		
	}
	public Song (String name, int duration, int BPM){
		this.name = name;
		this.duration = duration;
		this.BPM = BPM;
	}
	public String getName(){
		return name;
	}
	
	public int getDuration(){
		return duration;
	}
	
	public int getBPM(){
		return BPM;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setDuration(int duration){
		this.duration = duration;
	}
	
	public void setBPM(int BPM){
		this.BPM = BPM;
	}
}
