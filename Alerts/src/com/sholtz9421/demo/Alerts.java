package com.sholtz9421.demo;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Alerts extends Activity {
	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;
	private Button button5;
	private Button button6;
	
	private Toast toastLong;
	private Toast toastShort;
	
	private AlertDialog dialog1;
	private AlertDialog dialog2;
	private AlertDialog dialog3;
	
	private NotificationManager manager;
	private Notification message; 
	
	private static final int NOTIFY_ID = 1001;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	// basic initialization; 
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // create the objects
        toastLong = Toast.makeText(this,getString(R.string.ToastLongText),Toast.LENGTH_LONG);
        toastShort = Toast.makeText(this,getString(R.string.ToastShortText),Toast.LENGTH_SHORT);
        
        dialog1 = new AlertDialog.Builder(this).create();
        dialog1.setMessage(getString(R.string.DialogOneMsg));
        dialog1.setButton(DialogInterface.BUTTON_POSITIVE,"one",new DialogInterface.OnClickListener() {
        	public void onClick(DialogInterface dialog, int which) {
        		Log.v(Model.TAG,"*** one"); 
        	}
        });
        
        dialog2 = new AlertDialog.Builder(this).create();
        dialog2.setMessage(getString(R.string.DialogTwoMsg));
        dialog2.setButton(DialogInterface.BUTTON_POSITIVE, "one",new DialogInterface.OnClickListener() {
        	public void onClick(DialogInterface dialog,int which) {
        		Log.v(Model.TAG,"*** one"); 
        	}
        });
        dialog2.setButton(DialogInterface.BUTTON_NEGATIVE, "two", new DialogInterface.OnClickListener() {
        	public void onClick(DialogInterface dialog, int which) {
        		Log.v(Model.TAG,"*** two"); 
        	}
        });
        
        dialog3 = new AlertDialog.Builder(this).create(); 
        dialog3.setMessage(getString(R.string.DialogThreeMsg));
        dialog3.setButton(DialogInterface.BUTTON_POSITIVE,"one",new DialogInterface.OnClickListener() {
        	public void onClick(DialogInterface dialog,int which) {
        		Log.v(Model.TAG,"*** one"); 
        	}
        });
        dialog3.setButton(DialogInterface.BUTTON_NEGATIVE, "two", new DialogInterface.OnClickListener() {
        	public void onClick(DialogInterface dialog,int which) {
        		Log.v(Model.TAG,"*** two"); 
        	}
        });
        dialog3.setButton(DialogInterface.BUTTON_NEUTRAL,"three",new DialogInterface.OnClickListener() {
        	public void onClick(DialogInterface dialog,int which) {
        		Log.v(Model.TAG,"*** three");
        	}
        });
        
        manager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        message = new Notification(R.drawable.icon,getString(R.string.NotificationMsg),System.currentTimeMillis());
        
        // get references;
        button1 = (Button)findViewById(R.id.button1); 
        button1.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
        		// show dialog
        		toastShort.show();
        		
        		// log to console
        		Log.v(Model.TAG,"*** click"); 
        	}
        });
        
        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
        		// show dialog; 
        		toastLong.show();   
        		
        		// log to console; 
        		Log.v(Model.TAG,"*** click");
        	}
        });
        
        button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
        		// show dialog
        		dialog1.show();
        		
        		// log to console; 
        		Log.v(Model.TAG,"*** click");
        	}
        });
        
        button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
        		// show dialog
        		dialog2.show();
        		
        		// log to console;
        		Log.v(Model.TAG,"*** click");
        	}
        });
        
        button5 = (Button)findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
        		// show the dialog
        		dialog3.show();
        		
        		// log to console; 
        		Log.v(Model.TAG,"*** click"); 
        	}
        });
        
        button6 = (Button)findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
        		// configure intents and send the notification 
        		Intent msgIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.yahoo.com"));
        		PendingIntent intent = PendingIntent.getActivity(Alerts.this,0,msgIntent,Intent.FLAG_ACTIVITY_NEW_TASK);
        		
        		message.defaults |= Notification.DEFAULT_SOUND;
        		message.flags |= Notification.FLAG_AUTO_CANCEL;
        		message.setLatestEventInfo(getApplicationContext(), "Sample Title", "Sample Message", intent);
        		
        		manager.notify(NOTIFY_ID,message);
        		
        		// cancel the notification, so we can reuse;
        		manager.cancel(NOTIFY_ID);
        		
        		// log to console;
        		Log.v(Model.TAG,"*** click");
        	}
        });
    }
}