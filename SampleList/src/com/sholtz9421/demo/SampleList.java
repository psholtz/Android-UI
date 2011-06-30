package com.sholtz9421.demo;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;

public class SampleList extends ListActivity {
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	// basic initialization 
        super.onCreate(savedInstanceState);
        this.setListAdapter(new InteractiveArrayAdapter(this,getModel()));
        
        // log to console;
        Log.v(Model.TAG,"*** starting app"); 
    }
    
    private List<Model> getModel() { 
    	List<Model> list = new ArrayList<Model>();
    	list.add(get(Model.NAMES[0]));
    	list.add(get(Model.NAMES[1]));
    	list.add(get(Model.NAMES[2]));
    	list.add(get(Model.NAMES[3]));
    	list.add(get(Model.NAMES[4]));
    	list.add(get(Model.NAMES[5]));
    	list.add(get(Model.NAMES[6]));
    	list.add(get(Model.NAMES[7]));
    	list.add(get(Model.NAMES[8]));
    	list.add(get(Model.NAMES[9]));
    	return list;
    }
    
    private Model get(String s) {
    	return new Model(s);
    }
}