package com.example.reproduccion;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnPlay, btnStop;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPlay = (Button) findViewById(R.id.play);
        btnStop = (Button) findViewById(R.id.stop);
        btnPlay.setOnClickListener(this);
        btnStop.setOnClickListener(this);
        mp = MediaPlayer.create(this, R.raw.cancion);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.play:
                mp.start();
                //mp.seekTo(0);
                break;
            case R.id.stop:
                if(mp!=null)
                {
                    mp.stop();
                    mp.prepareAsync();
                }
                break;
        }
    }

}
