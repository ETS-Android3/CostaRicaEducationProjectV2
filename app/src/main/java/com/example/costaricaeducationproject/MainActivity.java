package com.example.costaricaeducationproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.res.Configuration;
import android.database.Cursor;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity{


//             _   _   ___  ______  _____   ___  ______  _      _____  _____
//            | | | | / _ \ | ___ \|_   _| / _ \ | ___ \| |    |  ___|/  ___|
//            | | | |/ /_\ \| |_/ /  | |  / /_\ \| |_/ /| |    | |__  \ `--.
//            | | | ||  _  ||    /   | |  |  _  || ___ \| |    |  __|  `--. \
//            \ \_/ /| | | || |\ \  _| |_ | | | || |_/ /| |____| |___ /\__/ /
//             \___/ \_| |_/\_| \_| \___/ \_| |_/\____/ \_____/\____/ \____/
//




    DatabaseHelper mDatabaseHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new FeedFragment()).commit();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }
    

    @Override
    protected void onPostCreate(Bundle savedInstanceState){
        super.onPostCreate(savedInstanceState);



    }


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.nav_item_one:
                    switchToFragment1();
                    break;

                case R.id.nav_item_two:
                    switchToFragment2();
                    break;

                case R.id.nav_item_three:
                    switchToFragment3();
                    break;
            }
            return true;
        }
    };

//    public void AddData(String newEntry){
//        boolean insertData = mDatabaseHelper.addData(newEntry);
//
//        if(insertData)
//            toastMessage("Data Inserted");
//        else
//            toastMessage("Something went Wrong");
//
//    }


//    private void populateListView(){
//        Cursor data = mDatabaseHelper.getData();
//        ArrayList<String> listData = new ArrayList<>();
//
//        while(data.moveToNext()){
//            listData.add(data.getString(1));
//        }
//
//    }



    public void switchToFragment1() {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.fragment_container, new FeedFragment()).commit();
    }

    public void switchToFragment2() {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.fragment_container, new ResourcesFragment()).commit();
    }

    public void switchToFragment3() {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.fragment_container, new MoreFragment()).commit();
    }


}