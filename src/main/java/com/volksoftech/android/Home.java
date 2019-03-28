package com.volksoftech.android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.volksoftech.android.homelist.ActivityAndIntents;
import com.volksoftech.android.homelist.Ads;
import com.volksoftech.android.homelist.AlarmManager;
import com.volksoftech.android.homelist.Animation;
import com.volksoftech.android.homelist.Device;
import com.volksoftech.android.homelist.Fragments;
import com.volksoftech.android.homelist.GoogleMap;
import com.volksoftech.android.homelist.Graphics;
import com.volksoftech.android.homelist.Interview;
import com.volksoftech.android.homelist.JSON;
import com.volksoftech.android.homelist.Menu;
import com.volksoftech.android.homelist.Multimedia;
import com.volksoftech.android.homelist.Quiz;
import com.volksoftech.android.homelist.SQLite;
import com.volksoftech.android.homelist.SensorTutorial;
import com.volksoftech.android.homelist.Service;
import com.volksoftech.android.homelist.Speech;
import com.volksoftech.android.homelist.Storage;
import com.volksoftech.android.homelist.Telephony;
import com.volksoftech.android.homelist.Tutorial;
import com.volksoftech.android.homelist.WebService;
import com.volksoftech.android.homelist.Widgets;

import java.util.ArrayList;
import java.util.Hashtable;

public class Home extends AppCompatActivity {
    SearchView searchView;
    ListView listView;
    ArrayList<String> list;
    CustomListAdapter adapter;
    Hashtable<Integer, String> hashtable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        searchView = findViewById(R.id.searchView);
        listView = findViewById(R.id.lv1);
        list = new ArrayList<>();
        hashtable = new Hashtable<>();
        list.add("Tutorial");
        list.add("Widgets");
        list.add("Activity and Intents");
        list.add("Fragments");
        list.add("Menu");
        list.add("Service");
        list.add("Alarm Manager");
        list.add("Storage");
        list.add("SQLite");
        list.add("JSON");
        list.add("Multimedia");
        list.add("Speech");
        list.add("Telephony");
        list.add("Device");
        list.add("Camera Tutorial");
        list.add("SensorTutorial Tutorial");
        list.add("Graphics");
        list.add("Animation");
        list.add("Web Service");
        list.add("Google Map");
        list.add("Ads");
        list.add("Interview");
        list.add("Quiz");
        hashtable.put(0, "Tutorial");
        hashtable.put(1, "Widgets");
        hashtable.put(2, "Activity and Intents");
        hashtable.put(3, "Fragments");
        hashtable.put(4, "Menu");
        hashtable.put(5, "Service");
        hashtable.put(6, "Alarm Manager");
        hashtable.put(7, "Storage");
        hashtable.put(8, "SQLite");
        hashtable.put(9, "JSON");
        hashtable.put(10, "Multimedia");
        hashtable.put(11, "Speech");
        hashtable.put(12, "Telephony");
        hashtable.put(13, "Device");
        hashtable.put(14, "Camera Tutorial");
        hashtable.put(15, "Sensor Tutorial");
        hashtable.put(16, "Graphics");
        hashtable.put(17, "Animation");
        hashtable.put(18, "Web Service");
        hashtable.put(19, "Google Map");
        hashtable.put(20, "Ads");
        hashtable.put(21, "Interview");
        hashtable.put(22, "Quiz");
        adapter = new CustomListAdapter(this, list);
        listView.setAdapter(adapter);
        listView.setTextFilterEnabled(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View v, int i, long l) {
                String title1="";
                    TextView title = v.findViewById(R.id.title);
                    title1=title.getText().toString();
                switch (title1) {
                    case "Tutorial":
                        startActivity(new Intent(Home.this, Tutorial.class));
                        overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
                        break;
                    case "Widgets":
                        startActivity(new Intent(Home.this, Widgets.class));
                        overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
                        break;
                    case "Activity and Intents":
                        startActivity(new Intent(Home.this, ActivityAndIntents.class));
                        overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
                        break;
                    case "Fragments":
                        startActivity(new Intent(Home.this, Fragments.class));
                        overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
                        break;
                    case "Menu":
                        startActivity(new Intent(Home.this, Menu.class));
                        overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
                        break;
                    case "Service":
                        startActivity(new Intent(Home.this, Service.class));
                        overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
                        break;
                    case "Alarm Manager":
                        startActivity(new Intent(Home.this, AlarmManager.class));
                        overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
                        break;
                    case "Storage":
                        startActivity(new Intent(Home.this, Storage.class));
                        overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
                        break;
                    case "SQLite":
                        startActivity(new Intent(Home.this, SQLite.class));
                        overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
                        break;
                    case "JSON":
                        startActivity(new Intent(Home.this, JSON.class));
                        overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
                        break;
                    case "Multimedia":
                        startActivity(new Intent(Home.this, Multimedia.class));
                        overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
                        break;
                    case "Speech":
                        startActivity(new Intent(Home.this, Speech.class));
                        overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
                        break;
                    case "Telephony":
                        startActivity(new Intent(Home.this, Telephony.class));
                        overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
                        break;
                    case "Device":
                        startActivity(new Intent(Home.this, Device.class));
                        overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
                        break;
                    case "Camera Tutorial":
                        startActivity(new Intent(Home.this, Graphics.class));
                        overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
                        break;
                    case "Sensor Tutorial":
                        startActivity(new Intent(Home.this, SensorTutorial.class));
                        overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
                        break;
                    case "Graphics":
                        startActivity(new Intent(Home.this, Graphics.class));
                        overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
                        break;
                    case "Animation":
                        startActivity(new Intent(Home.this, Animation.class));
                        overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
                        break;
                    case "Web Service":
                        startActivity(new Intent(Home.this, WebService.class));
                        overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
                        break;
                    case "Google Map":
                        startActivity(new Intent(Home.this, GoogleMap.class));
                        overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
                        break;
                    case "Ads":
                        startActivity(new Intent(Home.this, Ads.class));
                        overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
                        break;
                    case "Interview":
                        startActivity(new Intent(Home.this, Interview.class));
                        overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
                        break;
                    case "Quiz":
                        startActivity(new Intent(Home.this, Quiz.class));
                        overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
                        break;
                    default:
                        break;
                }
            }
        });
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                if (list.contains(query)) {
                    adapter.getFilter().filter(query);
                } else {
                    Toast.makeText(Home.this, "No Match found", Toast.LENGTH_LONG).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
    }
}
