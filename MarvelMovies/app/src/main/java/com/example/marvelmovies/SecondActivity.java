package com.example.marvelmovies;

import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerFragment;
import com.google.android.youtube.player.YouTubePlayerView;

public class SecondActivity extends YouTubeBaseActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second);

//            YouTubePlayerView youTubePlayerView =
//                    (YouTubePlayerView) findViewById(R.id.player);

//            youTubePlayerView.initialize("YOUR API KEY",
//                    new YouTubePlayer.OnInitializedListener() {
//                        @Override
//                        public void onInitializationSuccess(YouTubePlayer.Provider provider,
//                                                            YouTubePlayer youTubePlayer, boolean b) {
//
//                            // do any work here to cue video, play video, etc.
//                            youTubePlayer.cueVideo("5xVh-7ywKpE");
//                        }
//                        @Override
//                        public void onInitializationFailure(YouTubePlayer.Provider provider,
//                                                            YouTubeInitializationResult youTubeInitializationResult) {
//
//                        }
//                    });




            YouTubePlayerFragment youtubeFragment = (YouTubePlayerFragment)
                    getFragmentManager().findFragmentById(R.id.youtubeFragment);
            youtubeFragment.initialize("YOUR API KEY",
                    new YouTubePlayer.OnInitializedListener() {
                        @Override
                        public void onInitializationSuccess(YouTubePlayer.Provider provider,
                                                            YouTubePlayer youTubePlayer, boolean b) {
                            // do any work here to cue video, play video, etc.
                            youTubePlayer.cueVideo("5xVh-7ywKpE");
                        }
                        @Override
                        public void onInitializationFailure(YouTubePlayer.Provider provider,
                                                            YouTubeInitializationResult youTubeInitializationResult) {

                        }
                    });

        }
    }