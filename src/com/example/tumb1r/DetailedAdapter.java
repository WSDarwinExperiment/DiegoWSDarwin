package com.example.tumb1r;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.tumblr.api.PostsItemType;

public class DetailedAdapter extends ArrayAdapter<PostsItemType> {
	  private final Context context;
	  private final List<PostsItemType> values;

	  public DetailedAdapter(Context context, List<PostsItemType> values) {
	    super(context, R.layout.detailed_list_item, values);
	    this.context = context;
	    this.values = values;
	  }

	  @Override
	  public View getView(int position, View convertView, ViewGroup parent) {
	    LayoutInflater inflater = (LayoutInflater) context
	        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    
	    View rowView = inflater.inflate(R.layout.detailed_list_item, parent, false);
	    
	    PostsItemType post = values.get(position);
	    TextView titleView = (TextView) rowView.findViewById(R.id.textTitle);
	    TextView dateView = (TextView) rowView.findViewById(R.id.textDate);
	    TextView typeView = (TextView) rowView.findViewById(R.id.textType);
	    TextView stateView = (TextView) rowView.findViewById(R.id.textState);
	    TextView tagsView = (TextView) rowView.findViewById(R.id.textTags);
	    
	    //titleView.setText(post.getHeader());
	    typeView.setText(post.getType());
	    dateView.setText(post.getDate());
	    stateView.setText("State: " + post.getState());
	    tagsView.setText("Tags: " + post.getTags());
	    
	    return rowView;
	  }
	} 
