package com.example.projectmasteryee;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.tensorflow.lite.DataType;
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import com.example.projectmasteryee.ml.Model;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView tabBar;
    Tab_Main main;
    Tab_Second second;
    Tab_Thrid thrid;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabBar = findViewById(R.id.bottomNavigationView);

        main = new Tab_Main();
        second = new Tab_Second();
        thrid = new Tab_Thrid();

        getSupportFragmentManager().beginTransaction().replace(R.id.main_layout,main).commitAllowingStateLoss();

        tabBar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.tab1: {
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, main).commitAllowingStateLoss();
                        return true;
                    }
                    case R.id.tab2:{
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, second).commitAllowingStateLoss();
                        return true;
                    }

                    case R.id.tab3: {
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, thrid).commitAllowingStateLoss();
                        return true;
                    }
                    default: return false;
                }
            }
        });
    }
}