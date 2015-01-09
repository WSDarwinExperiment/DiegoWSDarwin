package com.example.tumb1r;

import java.util.Date;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.tumblr.api.PostsItemType;

public class SimpleListAdapter extends ArrayAdapter<PostsItemType> {
	  private final Context context;
	  private final List<PostsItemType> values;

	  public SimpleListAdapter(Context context, List<PostsItemType> values) {
	    super(context, R.layout.list_item, values);
	    this.context = context;
	    this.values = values;
	  }

	  @Override
	  public View getView(int position, View convertView, ViewGroup parent) {
	    LayoutInflater inflater = (LayoutInflater) context
	        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    
	    View rowView = inflater.inflate(R.layout.list_item, parent, false);
	    
	    PostsItemType post = values.get(position);
	    TextView titleView = (TextView) rowView.findViewById(R.id.textTitle);
	    TextView dateView = (TextView) rowView.findViewById(R.id.textDate);
	    TextView typeView = (TextView) rowView.findViewById(R.id.textType);
	    
	    titleView.setText(post.getTitle());
	    typeView.setText(post.getType());
	    dateView.setText(new Date(post.getTimestamp()).toString());
	    
	    return rowView;
	  }
	} 
