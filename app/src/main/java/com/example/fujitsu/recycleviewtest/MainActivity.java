package com.example.fujitsu.recycleviewtest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton fab;
    RecyclerView recyclerView;
    ProfileAdapter profileAdapter;
    ArrayList<ProfileInfo> profileInfos = new ArrayList<>();
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initviews();


    }

    private void initviews() {
        //fab
        fab = (FloatingActionButton) findViewById(R.id.fab);
        //recycleview
        recyclerView = (RecyclerView) findViewById(R.id.rvProfileList);
        //demo profiles create
        createProfies();
        //adapter
        profileAdapter = new ProfileAdapter(profileInfos);

        //edittext
        editText = (EditText) findViewById(R.id.etContryName);
        initlistener();
        setupAdapter();
    }

    private void setupAdapter() {
        LinearLayoutManager layoutmanager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        layoutmanager.setAutoMeasureEnabled(true);
        recyclerView.setLayoutManager(layoutmanager);
        recyclerView.setAdapter(profileAdapter);
    }
    //demo  profile createion
    private void createProfies() {
        String[] disName = new String[]{"Rajshai", "Dhaka", "Khulna"};
        for(int i = 0; i < disName.length ;i++){
            ProfileInfo profileInfo = new ProfileInfo();
            profileInfo.setText(disName[i]);
            profileInfo.setName(disName[i]);
            profileInfos.add(profileInfo);
        }
    }

    private void initlistener() {
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
