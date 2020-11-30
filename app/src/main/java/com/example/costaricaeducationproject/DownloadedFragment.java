package com.example.costaricaeducationproject;

import android.content.Intent;
import android.net.Uri;
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

        CardView geometryButton = (CardView) view.findViewById(R.id.geometry);
        geometryButton.setOnClickListener(this);

        CardView writingButton = (CardView) view.findViewById(R.id.writing);
        writingButton.setOnClickListener(this);

        CardView readingButton = (CardView) view.findViewById(R.id.reading);
        readingButton.setOnClickListener(this);

        CardView historyButton = (CardView) view.findViewById(R.id.history);
        historyButton.setOnClickListener(this);

        CardView otherButton = (CardView) view.findViewById(R.id.other);
        otherButton.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.algebra:
                DirectoryFragment algebraFragment = new DirectoryFragment();
                Bundle algebraBundle = new Bundle();
                algebraBundle.putString("subject", "algebra");
                algebraBundle.putBoolean("downloaded", true);
                algebraFragment.setArguments(algebraBundle);

                getFragmentManager().beginTransaction().replace(R.id.fragment_container, algebraFragment, "NewFragmentTag").addToBackStack("true").commit();
                break;

            case R.id.geometry:
                DirectoryFragment geometryFragment = new DirectoryFragment();
                Bundle geometryBundle = new Bundle();
                geometryBundle.putString("subject", "geometry");
                geometryBundle.putBoolean("downloaded", true);
                geometryFragment.setArguments(geometryBundle);

                getFragmentManager().beginTransaction().replace(R.id.fragment_container, geometryFragment, "NewFragmentTag").addToBackStack("true").commit();
                break;

            case R.id.reading:
                DirectoryFragment readingFragment = new DirectoryFragment();
                Bundle readingBundle = new Bundle();
                readingBundle.putString("subject", "reading");
                readingBundle.putBoolean("downloaded", true);
                readingFragment.setArguments(readingBundle);

                getFragmentManager().beginTransaction().replace(R.id.fragment_container, readingFragment, "NewFragmentTag").addToBackStack("true").commit();
                break;

            case R.id.writing:
                DirectoryFragment writingFragment = new DirectoryFragment();
                Bundle writingBundle = new Bundle();
                writingBundle.putString("subject", "writing");
                writingBundle.putBoolean("downloaded", true);
                writingFragment.setArguments(writingBundle);

                getFragmentManager().beginTransaction().replace(R.id.fragment_container, writingFragment, "NewFragmentTag").addToBackStack("true").commit();
                break;

            case R.id.history:
                DirectoryFragment historyFragment = new DirectoryFragment();
                Bundle historyBundle = new Bundle();
                historyBundle.putString("subject", "history");
                historyBundle.putBoolean("downloaded", true);
                historyFragment.setArguments(historyBundle);

                getFragmentManager().beginTransaction().replace(R.id.fragment_container, historyFragment, "NewFragmentTag").addToBackStack("true").commit();
                break;

            case R.id.other:
                DirectoryFragment otherFragment = new DirectoryFragment();
                Bundle otherBundle = new Bundle();
                otherBundle.putString("subject", "other");
                otherBundle.putBoolean("downloaded", true);
                otherFragment.setArguments(otherBundle);

                getFragmentManager().beginTransaction().replace(R.id.fragment_container, otherFragment, "NewFragmentTag").addToBackStack("true").commit();
                break;

            default:
                break;
        }
    }
}
