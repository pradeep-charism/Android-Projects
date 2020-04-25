package com.example.marvelmovies.activity;

import android.os.Bundle;

import com.example.marvelmovies.R;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerFragment;

public class SecondActivity extends YouTubeBaseActivity {

    private final String DEVELOPER_API_KEY = "PRADEEP KUMAR DEVELOPER KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        addYoutubeFragment(getYoutubeFragmentFor(R.id.youtubeFragment1), "xjDjIWPwcPU");

    }

    private YouTubePlayerFragment getYoutubeFragmentFor(int p) {
        return (YouTubePlayerFragment) getFragmentManager().findFragmentById(p);
    }

    private void addYoutubeFragment(YouTubePlayerFragment youtubeFragment, final String youtubeLink) {
        youtubeFragment.initialize(DEVELOPER_API_KEY,
                new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider,
                                                        YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.cueVideo(youtubeLink);
                    }

                    @Override
                    public void onInitializationFailure(YouTubePlayer.Provider provider,
                                                        YouTubeInitializationResult youTubeInitializationResult) {

                    }
                });
    }
}