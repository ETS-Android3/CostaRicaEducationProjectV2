package com.example.costaricaeducationproject;

import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.apache.commons.lang3.text.WordUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class DirectoryFragment extends Fragment {

    Boolean downloaded;
    String subject;


    private ArrayList<String> mTitle = new ArrayList<>();

    private ArrayList<String> filesInDir = new ArrayList<String>();




    private boolean listAssetFiles(String path) {

        String [] list;
        try {
            list = getActivity().getAssets().list(path);
            if (list.length > 0) {
                // This is a folder
                for (String file : list) {
                    if (!listAssetFiles(path + "/" + file))
                        return false;
                    else {
                        // This is a file
                        filesInDir.add(file);
                    }
                }
            }
        } catch (IOException e) {
            return false;
        }

        return true;
    }





    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.directory_fragment, container, false);

        listAssetFiles("c");

        Bundle bundle = this.getArguments();
        subject = bundle.getString("subject");
        downloaded = bundle.getBoolean("downloaded");

        if(!downloaded){
            listAssetFiles("Available/" + WordUtils.capitalizeFully(subject));

            RecyclerView recyclerViewMain = view.findViewById(R.id.recycler_view_directory);
            DirectoryAdapter adapterMain = new DirectoryAdapter( this.getActivity(), filesInDir, false, WordUtils.capitalizeFully(subject));
            recyclerViewMain.setAdapter(adapterMain);
            recyclerViewMain.setLayoutManager(new LinearLayoutManager(this.getActivity()));

        }else if(downloaded){
            listAssetFiles("Downloaded/" + WordUtils.capitalizeFully(subject));

            RecyclerView recyclerViewMain = view.findViewById(R.id.recycler_view_directory);
            DirectoryAdapter adapterMain = new DirectoryAdapter( this.getActivity(), filesInDir, true, WordUtils.capitalizeFully(subject));
            recyclerViewMain.setAdapter(adapterMain);
            recyclerViewMain.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        } else
            System.out.println("FUCK THIS BULLSHIT ASS PROGRAM FUCK!!!!");
        return view;
    }




    private void initAssignments(){

        mTitle.add("John Johnson");




    }



}
