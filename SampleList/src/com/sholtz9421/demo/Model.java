package com.sholtz9421.demo;

public class Model {
	public static final String TAG = "SampleList";
	public static final String[] NAMES = { 
			"London", "New York", "Hong Kong", "Paris", 
			"Singapore", "Tokyo", "Sydney", "Milan", "Shanghai", "Beijing",
			"Madrid", "Moscow","Seoul", "Toronto", "Brussels" };

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
