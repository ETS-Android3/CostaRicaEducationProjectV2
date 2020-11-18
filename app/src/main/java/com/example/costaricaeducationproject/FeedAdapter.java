package com.example.costaricaeducationproject;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import org.apache.commons.lang3.text.WordUtils;

import java.util.ArrayList;

public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.ViewHolderFeed> {
    private ArrayList<String> mNameFeed = new ArrayList<>();
    private ArrayList<String> mDateFeed = new ArrayList<>();
    private ArrayList<String> mTitleFeed = new ArrayList<>();
    private ArrayList<String> mSubtextFeed = new ArrayList<>();
    private Context mContextFeed;

    public FeedAdapter(Context context, ArrayList<String> name, ArrayList<String> date, ArrayList<String> text, ArrayList<String> subtext){
        mNameFeed = name;
        mDateFeed = date;
        mTitleFeed = text;
        mSubtextFeed = subtext;
        mContextFeed = context;
    }

    public ViewHolderFeed onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.feed_card, parent, false);

        ViewHolderFeed holderFeed = new ViewHolderFeed(view);
        return holderFeed;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderFeed holder, int position) {
        holder.nameFeed.setText(mNameFeed.get(position));
        holder.dateFeed.setText(mDateFeed.get(position));
        holder.titleFeed.setText(WordUtils.capitalizeFully(mTitleFeed.get(position)));
        holder.subtextFeed.setText(mSubtextFeed.get(position));
    }


    @Override
    public int getItemCount(){
        return mTitleFeed.size();
    }

    public class ViewHolderFeed extends RecyclerView.ViewHolder{

        TextView titleFeed;
        TextView subtextFeed;
        TextView nameFeed;
        TextView dateFeed;
        LinearLayout parentLayoutFeed;

        public ViewHolderFeed(@NonNull View itemView){
            super(itemView);
            titleFeed = itemView.findViewById(R.id.title_feed);
            subtextFeed = itemView.findViewById(R.id.subtext_feed);
            nameFeed = itemView.findViewById(R.id.name_feed);
            dateFeed = itemView.findViewById(R.id.date_feed);
            parentLayoutFeed = itemView.findViewById(R.id.parent_layout_feed);
        }
    }




}
