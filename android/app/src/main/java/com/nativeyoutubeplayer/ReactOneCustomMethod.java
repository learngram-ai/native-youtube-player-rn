package com.nativeyoutubeplayer;

import android.annotation.SuppressLint;
import android.provider.Settings;
import android.os.Bundle;
import android.content.res.Configuration;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;

// import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants;
// import com.pierfrancescosoffritti.aytplayersample.R;
import com.nativeyoutubeplayer.ReactOneClass;

public class ReactOneCustomMethod extends ReactContextBaseJavaModule {
    private static ReactApplicationContext reactContext;
    // private YouTubePlayerView youTubePlayerView;
    ReactOneCustomMethod(ReactApplicationContext context) {
       super(context);
       reactContext = context;
    }

   

    @NonNull
    @Override
    public String getName() {
        return "ReactOneCustomMethod";
    }

    @ReactMethod
    public void createYTPlayer(String videoId, Boolean autoPlay , Promise response) {
    //     Activity currentActivity = getCurrentActivity();
    //     currentActivity.runOnUiThread(new Runnable() {
    
    // @Override
    // public void run() {
         ReactOneClass youTubePlayerClass = new ReactOneClass();
        //  getLifecycle().addObserver(youTubePlayerView);
//     }
// });
        // getLifecycle().addObserver(youTubePlayerView);
        // youTubePlayerClass.youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
        //     // @Override
        //     public void onReady(@NonNull YouTubePlayer youTubePlayer) {
        //     //   String videoId = "S0Q4gqBUs7c";
        //       youTubePlayer.loadVideo(videoId, 0);
        //       response.resolve("Ready");
        //     }
        //     // @Override
        //     // public void onError(@NonNull YouTubePlayer youTubePlayer , @NonNull PlayerConstants.PlayerError error) {
                
        //     //   response.reject(error);
        //     // }
        //   });
    }
}