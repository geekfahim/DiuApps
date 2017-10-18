package com.devfahim.diuapps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LauncherActivity extends Activity {
    Button StudentPortal,Bus,Cgpa,Maps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        StudentPortal = (Button)findViewById(R.id.btnsp);
        StudentPortal.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(LauncherActivity.this, StudentPortal.class);
                startActivity(i);

            }
        });


        Bus = (Button)findViewById(R.id.btnbt);
        Bus.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(LauncherActivity.this, MainActivity.class);
                startActivity(i);

            }
        });

        Cgpa = (Button)findViewById(R.id.btncc);
        Cgpa.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(LauncherActivity.this,CgpaActivity.class);
                startActivity(i);

            }
        });

        Maps = (Button)findViewById(R.id.btnim);
        Maps.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(LauncherActivity.this, IndoorDemoActivity.class);
                startActivity(i);

            }
        });



    }



}
