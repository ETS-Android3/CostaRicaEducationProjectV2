package com.example.costaricaeducationproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DownloadedFragment extends Fragment implements View.OnClickListener {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.downloaded_fragment, container, false);

        CardView algebraButton = (CardView) view.findViewById(R.id.algebra);
        algebraButton.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        DirectoryFragment fragment = new DirectoryFragment();
        Bundle bundle = new Bundle();
        bundle.putString("subject", "algebra");
        bundle.putBoolean("downloaded", false);
        fragment.setArguments(bundle);

        final FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_container, fragment, "NewFragmentTag");
        ft.commit();
    }





}
