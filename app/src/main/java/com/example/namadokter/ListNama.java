package com.example.namadokter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListNama extends ArrayAdapter<String> {
    private String [] names;
    private String [] desc;
    private String [] no_tlp;
    private Integer[] imageid;
    private Activity context;

    public ListNama(Activity context, String[] names, String[] desc, String[] no_tlp, Integer[] imageid){
        super (context, R.layout.layout, names);
        this.context = context;
        this.names = names;
        this.no_tlp = no_tlp;
        this.desc = desc;
        this.imageid = imageid;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.layout, null, true);
        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);
        TextView textViewDesc = (TextView) listViewItem.findViewById(R.id.textViewDesc);
        TextView textViewNIM = (TextView) listViewItem.findViewById(R.id.textViewNIM);
        ImageView image = (ImageView) listViewItem.findViewById(R.id.imageView);

        textViewName.setText(names [position]);
        textViewDesc.setText(desc [position]);
        textViewNIM.setText(no_tlp [position]);
        image.setImageResource(imageid[position]);
        return listViewItem;
    }
}
