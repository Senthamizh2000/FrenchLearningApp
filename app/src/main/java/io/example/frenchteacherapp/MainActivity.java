package io.example.frenchteacherapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;
import android.util.Log;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button blackBtn, greenBtn, purpleBtn, redBtn, yellowBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blackBtn = findViewById(R.id.blackBtn);
        greenBtn = findViewById(R.id.greenBtn);
        purpleBtn = findViewById(R.id.purpleBtn);
        redBtn = findViewById(R.id.redBtn);
        yellowBtn = findViewById(R.id.yellowBtn);

        redBtn.setOnClickListener(this);
        blackBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);
        purpleBtn.setOnClickListener(this);
        yellowBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        int clickedId = v.getId();

        if (clickedId == R.id.blackBtn) {
            playSound(R.raw.black);
        } else if (clickedId == R.id.greenBtn) {
            playSound(R.raw.green);
        } else if (clickedId == R.id.purpleBtn) {
            playSound(R.raw.purple);
        } else if (clickedId == R.id.redBtn) {
            playSound(R.raw.red);
        } else if (clickedId == R.id.yellowBtn) {
            playSound(R.raw.yellow);
        }

    }


    public void playSound ( int id){
        MediaPlayer mp = MediaPlayer.create(this, id);
        mp.start();
    }

}
