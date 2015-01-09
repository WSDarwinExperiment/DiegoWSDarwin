package com.example.tumb1r;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class SimpleListAdapter extends ArrayAdapter<Post> {
	  private final Context context;
	  private final List<Post> values;

	  public SimpleListAdapter(Context context, List<Post> values) {
	    super(context, R.layout.list_item, values);
	    this.context = context;
	    this.values = values;
	  }

	  @Override
	  public View getView(int position, View convertView, ViewGroup parent) {
	    LayoutInflater inflater = (LayoutInflater) context
	        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    
	    View rowView = inflater.inflate(R.layout.list_item, parent, false);
	    
	    Post post = values.get(position);
	    TextView titleView = (TextView) rowView.findViewById(R.id.textTitle);
	    TextView dateView = (TextView) rowView.findViewById(R.id.textDate);
	    TextView typeView = (TextView) rowView.findViewById(R.id.textType);
	    
	    titleView.setText(post.getHeader());
	    typeView.setText(post.getType());
	    dateView.setText(post.getDate());
	    
	    return rowView;
	  }
	} 
