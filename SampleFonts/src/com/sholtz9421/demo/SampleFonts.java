package com.sholtz9421.demo;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SampleFonts extends Activity {
	private RelativeLayout layout1;
	private TextView text1;
	private TextView text2; 
	private TextView text3; 
	private TextView text4; 
	private TextView text5;
	private TextView text6;
	
	private Typeface tf1; 
	private Typeface tf2; 
	private Typeface tf3; 
	private Typeface tf4; 
	private Typeface tf5; 
	private Typeface tf6;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	// basic initialization
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // get the references
        LayoutInflater inflater = getLayoutInflater();
        layout1 = (RelativeLayout)inflater.inflate(R.layout.main, null);
        Log.v(Model.TAG,"*** layout: " + layout1); 
        
        text1 = (TextView)findViewById(R.id.textView1);
        text1.setBackgroundColor(Color.parseColor("#014401"));
        tf1 = Typeface.createFromAsset(getAssets(),"fonts/File.otf");
        text1.setTypeface(tf1); 
        text1.setText("File");
        
        text2 = (TextView)findViewById(R.id.textView2);
        text2.setBackgroundColor(Color.parseColor("#440101")); 
        tf2 = Typeface.createFromAsset(getAssets(),"fonts/AmputaBangiz.ttf");
        text2.setTypeface(tf2); 
        text2.setText("Amputa\nBangiz");
        
        text3 = (TextView)findViewById(R.id.textView3);
        text3.setBackgroundColor(Color.parseColor("#010144")); 
        tf3 = Typeface.createFromAsset(getAssets(),"fonts/Quicksand_Dash.otf");
        text3.setTypeface(tf3); 
        text3.setText("Quicksand"); 
        
        text4 = (TextView)findViewById(R.id.textView4);
        text4.setBackgroundColor(Color.parseColor("#444401"));
        tf4 = Typeface.createFromAsset(getAssets(), "fonts/QuadLight.otf");
        text4.setTypeface(tf4);
        text4.setText("Quad");
        
        text5 = (TextView)findViewById(R.id.textView5);
        text5.setBackgroundColor(Color.parseColor("#014444"));
        tf5 = Typeface.createFromAsset(getAssets(), "fonts/orbitron-black.otf");
        text5.setTypeface(tf5);
        text5.setText("Orbitron");
        
        text6 = (TextView)findViewById(R.id.textView6);
        text6.setBackgroundColor(Color.parseColor("#440144"));
        tf6 = Typeface.createFromAsset(getAssets(), "fonts/Dubtronic-Solid.otf");
        text6.setTypeface(tf6); 
        text6.setText("Dubtronic"); 
    }
}