package com.noor.videoplayer;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView video;
    MediaController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        video=(VideoView)findViewById(R.id.videoView);
        controller=new MediaController(this);

        video.setMediaController(controller);
        video.setVideoURI(Uri.parse("android.resource://com.noor.videoplayer/raw/video")); //for set video location
        video.start();


    }
}
