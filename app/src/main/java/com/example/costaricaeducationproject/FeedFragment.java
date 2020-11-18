package com.example.costaricaeducationproject;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FeedFragment extends Fragment {



//             _   _   ___  ______  _____   ___  ______  _      _____  _____
//            | | | | / _ \ | ___ \|_   _| / _ \ | ___ \| |    |  ___|/  ___|
//            | | | |/ /_\ \| |_/ /  | |  / /_\ \| |_/ /| |    | |__  \ `--.
//            | | | ||  _  ||    /   | |  |  _  || ___ \| |    |  __|  `--. \
//            \ \_/ /| | | || |\ \  _| |_ | | | || |_/ /| |____| |___ /\__/ /
//             \___/ \_| |_/\_| \_| \___/ \_| |_/\____/ \_____/\____/ \____/
//

    private ArrayList<String> mName = new ArrayList<>();
    private ArrayList<String> mDate = new ArrayList<>();
    private ArrayList<String> mText = new ArrayList<>();
    private ArrayList<String> mSubtext = new ArrayList<>();



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.feed_fragment, container, false);

        initMessages();

        RecyclerView recyclerViewMain = view.findViewById(R.id.recycler_view_feed);
        FeedAdapter adapterMain = new FeedAdapter( this.getActivity(), mName, mDate, mText, mSubtext);
        recyclerViewMain.setAdapter(adapterMain);
        recyclerViewMain.setLayoutManager(new LinearLayoutManager(this.getActivity()));

        return view;

    }




    private void initMessages(){

        mName.add("John Johnson");
        mDate.add("Nov. 12");
        mText.add("A new worksheet has been added to Algabra");
        mSubtext.add(null);

        mName.add("John Johnson");
        mDate.add("Nov. 11");
        mText.add("A new worksheet has been added to Algabra");
        mSubtext.add(null);


        mName.add("John Johnson");
        mDate.add("Nov. 10");
        mText.add("A new worksheet has been added to Algabra");
        mSubtext.add(null);


        mName.add("John Johnson");
        mDate.add("Nov. 9");
        mText.add("A new worksheet has been added to Algabra");
        mSubtext.add(null);


        mName.add("John Johnson");
        mDate.add("Nov. 8");
        mText.add("A new worksheet has been added to Algabra");
        mSubtext.add(null);


        mName.add("John Johnson");
        mDate.add("Nov. 7");
        mText.add("A new worksheet has been added to Algabra");
        mSubtext.add(null);


        mName.add("John Johnson");
        mDate.add("Nov. 6");
        mText.add("A new worksheet has been added to Algabra");
        mSubtext.add(null);


        mName.add("John Johnson");
        mDate.add("Nov. 5");
        mText.add("A new worksheet has been added to Algabra");
        mSubtext.add(null);


        mName.add("John Johnson");
        mDate.add("Nov. 4");
        mText.add("A new worksheet has been added to Algabra");
        mSubtext.add(null);


        mName.add("John Johnson");
        mDate.add("Nov. 3");
        mText.add("A new worksheet has been added to Algabra");
        mSubtext.add(null);


        mName.add("John Johnson");
        mDate.add("Nov. 2");
        mText.add("A new worksheet has been added to Algabra");
        mSubtext.add(null);


        mName.add("John Johnson");
        mDate.add("Nov. 1");
        mText.add("A new worksheet has been added to Algabra");
        mSubtext.add(null);


        mName.add("John Johnson");
        mDate.add("Oct. 30");
        mText.add("A new worksheet has been added to Algabra");
        mSubtext.add(null);


        mName.add("John Johnson");
        mDate.add("Oct. 29");
        mText.add("A new worksheet has been added to Algabra");
        mSubtext.add(null);


        mName.add("John Johnson");
        mDate.add("Oct. 28");
        mText.add("A new worksheet has been added to Algabra");
        mSubtext.add(null);


        mName.add("John Johnson");
        mDate.add("Oct. 27");
        mText.add("A new worksheet has been added to Algabra");
        mSubtext.add(null);


        mName.add("John Johnson");
        mDate.add("Oct. 26");
        mText.add("A new worksheet has been added to Algabra");
        mSubtext.add(null);


        mName.add("John Johnson");
        mDate.add("Oct. 25");
        mText.add("A new worksheet has been added to Algabra");
        mSubtext.add(null);


        mName.add("John Johnson");
        mDate.add("Oct. 24");
        mText.add("A new worksheet has been added to Algabra");
        mSubtext.add(null);


        mName.add("John Johnson");
        mDate.add("Oct. 23");
        mText.add("A new worksheet has been added to Algabra");
        mSubtext.add(null);



    }




}
