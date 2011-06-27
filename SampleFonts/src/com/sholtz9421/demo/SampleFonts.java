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
	
	private TextView text7;
	private TextView text8;
	private TextView text9;
	private TextView text10;
	private TextView text11;
	private TextView text12; 
	
	private Typeface tf1; 
	private Typeface tf2; 
	private Typeface tf3; 
	private Typeface tf4; 
	private Typeface tf5; 
	private Typeface tf6;
	
	private Typeface tf7;
	private Typeface tf8;
	private Typeface tf9;
	private Typeface tf10;
	private Typeface tf11;
	private Typeface tf12;
	
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
        
        // FIRST SIX SLOTS 
        text1 = (TextView)findViewById(R.id.textView1);
        tf1 = Typeface.createFromAsset(getAssets(),"fonts/File.otf");
        text1.setTypeface(tf1); 
        text1.setText("File");
        
        text2 = (TextView)findViewById(R.id.textView2);
        tf2 = Typeface.createFromAsset(getAssets(),"fonts/AmputaBangiz.ttf");
        text2.setTypeface(tf2); 
        text2.setText("Amputa\nBangiz");
        
        text3 = (TextView)findViewById(R.id.textView3);
        tf3 = Typeface.createFromAsset(getAssets(),"fonts/Quicksand_Dash.otf");
        text3.setTypeface(tf3); 
        text3.setText("Quicksand"); 
        
        text4 = (TextView)findViewById(R.id.textView4);
        tf4 = Typeface.createFromAsset(getAssets(), "fonts/QuadLight.otf");
        text4.setTypeface(tf4);
        text4.setText("Quad");
        
        text5 = (TextView)findViewById(R.id.textView5);
        tf5 = Typeface.createFromAsset(getAssets(), "fonts/orbitron-black.otf");
        text5.setTypeface(tf5);
        text5.setText("Orbitron");
        
        text6 = (TextView)findViewById(R.id.textView6);
        tf6 = Typeface.createFromAsset(getAssets(), "fonts/Dubtronic-Solid.otf");
        text6.setTypeface(tf6); 
        text6.setText("Dubtronic"); 
        
        // NEXT SIX SLOTS
        text7 = (TextView)findViewById(R.id.textView7);
        text7.setText("Sliced AB");
        tf7 = Typeface.createFromAsset(getAssets(), "fonts/Sliced-AB.ttf");
        text7.setTypeface(tf7);
        
        text8 = (TextView)findViewById(R.id.textView8);
        text8.setText("Paranoid");
        tf8 = Typeface.createFromAsset(getAssets(), "fonts/Paranoid.otf");
        text8.setTypeface(tf8); 
       
        text9 = (TextView)findViewById(R.id.textView9); 
        text9.setText("Cranberry");
        tf9 = Typeface.createFromAsset(getAssets(), "fonts/CranberryBlues.ttf");
        text9.setTypeface(tf9); 

        text10 = (TextView)findViewById(R.id.textView10);
        text10.setText("Drew Cap");
        tf10 = Typeface.createFromAsset(getAssets(), "fonts/Drew-Cap.ttf");
        text10.setTypeface(tf10); 

        text11 = (TextView)findViewById(R.id.textView11);
        text11.setText("Exus"); 
        tf11 = Typeface.createFromAsset(getAssets(), "fonts/Exus.ttf");
        text11.setTypeface(tf11); 

        text12 = (TextView)findViewById(R.id.textView12);
        text12.setText("Stahl Beton");
        tf12 = Typeface.createFromAsset(getAssets(), "fonts/stahlbeton.otf");
        text12.setTypeface(tf12); 

        Log.v(Model.TAG,"*** starting app"); 
    }
}