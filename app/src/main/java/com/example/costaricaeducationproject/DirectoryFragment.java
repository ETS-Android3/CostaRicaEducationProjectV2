package com.example.costaricaeducationproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DirectoryFragment extends Fragment {

    Boolean downloaded;
    String subject;


    private ArrayList<String> mTitle = new ArrayList<>();




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.directory_fragment, container, false);


        Bundle bundle = this.getArguments();
        subject = bundle.getString("subject");
        downloaded = bundle.getBoolean("downloaded");

        if(downloaded){
            if(subject == "algebra"){

            }else if(subject == "writing"){

            }else if(subject == "reading"){

            }else if(subject == "geometry"){

            }else if(subject == "history"){

            }else if(subject == "other"){

            }
        }else if(!downloaded){
            if(subject == "algebra"){
                initAssignments();

                RecyclerView recyclerViewMain = view.findViewById(R.id.recycler_view_directory);
                DirectoryAdapter adapterMain = new DirectoryAdapter( this.getActivity(), mTitle);
                recyclerViewMain.setAdapter(adapterMain);
                recyclerViewMain.setLayoutManager(new LinearLayoutManager(this.getActivity()));

            }else if(subject == "writing"){

            }else if(subject == "reading"){

            }else if(subject == "geometry"){

            }else if(subject == "history"){

            }else if(subject == "other"){

            }
        } else
            System.out.println("FUCK THIS BULLSHIT ASS PROGRAM FUCK!!!!");
        return view;
    }



    private void initAssignments(){

        mTitle.add("John Johnson");




    }



}
