package com.example.costaricaeducationproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.apache.commons.lang3.text.WordUtils;

import java.util.ArrayList;

public class DirectoryAdapter extends RecyclerView.Adapter<DirectoryAdapter.ViewHolderDirectory> {
    private ArrayList<String> mTitleDirectory = new ArrayList<>();
    private Context mContextDirectory;

    public DirectoryAdapter(Context context, ArrayList<String> name){
        mTitleDirectory = name;
        mContextDirectory = context;
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
