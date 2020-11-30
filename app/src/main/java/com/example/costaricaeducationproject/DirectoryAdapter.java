package com.example.costaricaeducationproject;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import org.apache.commons.lang3.text.WordUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class DirectoryAdapter extends RecyclerView.Adapter<DirectoryAdapter.ViewHolderDirectory> {
    private ArrayList<String> mTitleDirectory = new ArrayList<>();
    private Context mContextDirectory;
    private Boolean mDownloaded;
    private String mSubject;

    public DirectoryAdapter(Context context, ArrayList<String> name, Boolean downloaded, String subject){
        mTitleDirectory = name;
        mContextDirectory = context;
        mDownloaded = downloaded;
        mSubject = subject;
    }

    public ViewHolderDirectory onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.directory_list_element, parent, false);

        ViewHolderDirectory holderDirectory = new ViewHolderDirectory(view);
        return holderDirectory;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDirectory holder, int position) {
        holder.titleDirectory.setText(mTitleDirectory.get(position));

        holder.parentLayoutDirectory.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(mDownloaded){
                    PdfFragment readingFragment = new PdfFragment();
                    Bundle readingBundle = new Bundle();
                    readingBundle.putString("subject", "reading");
                    readingBundle.putBoolean("downloaded", true);
                    readingBundle.putString("pdf", mTitleDirectory.get(position));
                    readingFragment.setArguments(readingBundle);

                    ((FragmentActivity) v.getContext()).getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, readingFragment, "NewFragmentTag").addToBackStack("true").commit();

                } else if(!mDownloaded){
                    PdfFragment readingFragment = new PdfFragment();
                    Bundle readingBundle = new Bundle();
                    readingBundle.putString("subject", "reading");
                    readingBundle.putBoolean("downloaded", false);
                    readingBundle.putString("pdf", mTitleDirectory.get(position));
                    readingFragment.setArguments(readingBundle);

                    ((FragmentActivity) v.getContext()).getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, readingFragment, "NewFragmentTag").addToBackStack("true").commit();

                }
            }
        });
    }



    @Override
    public int getItemCount(){
        return mTitleDirectory.size();
    }

    public class ViewHolderDirectory extends RecyclerView.ViewHolder{

        TextView titleDirectory;
        LinearLayout parentLayoutDirectory;

        public ViewHolderDirectory(@NonNull View itemView){
            super(itemView);
            titleDirectory = itemView.findViewById(R.id.title_directory);
            parentLayoutDirectory = itemView.findViewById(R.id.parent_layout_directory);
        }
    }
}
