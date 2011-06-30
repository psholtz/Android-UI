package com.sholtz9421.demo;

import java.util.List;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

public class InteractiveArrayAdapter extends ArrayAdapter<Model> {

	private final List<Model> list;
	private final Activity context;
	
	public InteractiveArrayAdapter(Activity context, List<Model> list) {
		super(context,R.layout.rowlayout,list);
		
		this.context = context;
		this.list = list;
	}
	
	static class ViewHolder {
		protected ImageView image;
		protected TextView text;
		protected CheckBox checkbox; 
	}
	
	public View getView(int position, View convertView, ViewGroup parent) {
		View view = null;
		if ( convertView == null ) {
			// configure the view;
			view = context.getLayoutInflater().inflate(R.layout.rowlayout, null);
			
			// configure the viewholder; 
			final ViewHolder viewHolder = new ViewHolder();
			viewHolder.image = (ImageView)view.findViewById(R.id.icon);
			viewHolder.text = (TextView)view.findViewById(R.id.label); 
			viewHolder.checkbox = (CheckBox)view.findViewById(R.id.check);
			viewHolder.checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
					Model element = (Model)viewHolder.checkbox.getTag();
					element.setSelected(buttonView.isChecked());
					
					// dump the model state to console; 
					introspect(); 
				}
			});

			// combine them;
			view.setTag(viewHolder);
			viewHolder.checkbox.setTag(list.get(position)); 
		} else {
			view = convertView;
			((ViewHolder)view.getTag()).checkbox.setTag(list.get(position));
		}
		ViewHolder holder = (ViewHolder)view.getTag();
		holder.text.setText(list.get(position).getName());
		holder.checkbox.setChecked(list.get(position).isSelected());
		return view; 
	}
	
	public void introspect() {
		Model m; 
		String s; 
		Log.v(Model.TAG,"***");
		Log.v(Model.TAG,"*** Introspect Model State");
		Log.v(Model.TAG,"*** ----------------------");
		for ( int i=0; i < list.size(); ++i ) {
			m = (Model)list.get(i); 
			s = "*** City: " + m.getName(); 
			s += m.isSelected() ? " (TRUE)" : "";
			Log.v(Model.TAG, s);
		}
		Log.v(Model.TAG,"***");
	}
}
