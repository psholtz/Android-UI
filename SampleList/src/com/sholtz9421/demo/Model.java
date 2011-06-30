package com.sholtz9421.demo;

public class Model {
	public static final String TAG = "SampleList";
	public static final String[] NAMES = { "New York", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten" };

	private String name;
	private boolean selected; 
	
	public Model(String name) { 
		this.name = name;
	}
	
	// getters
	public String getName() 	
	{ return name; }
	
	public boolean isSelected() 
	{ return selected; }
	
	// setters 
	public void setName(String name) 			
	{ this.name = name; }
	
	public void setSelected(boolean selected) 	
	{ this.selected = selected; }
}
