package com.example.costaricaeducationproject;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
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
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


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

    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState){
        super.onPostCreate(savedInstanceState);



    }

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





    @Override
    public boolean onNavigationItemSelected(MenuItem item){
        Fragment selectedFragment = null;
        switch (item.getItemId()){
            case R.id.nav_item_one:
                selectedFragment = new FeedFragment();
                break;
            case R.id.nav_item_two:
                selectedFragment = new ResourcesFragment();
                break;
            case R.id.nav_item_three:
                selectedFragment = new MoreFragment();
                break;

        }
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                selectedFragment).commit();
        return true;

    }



    private void toastMessage(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}