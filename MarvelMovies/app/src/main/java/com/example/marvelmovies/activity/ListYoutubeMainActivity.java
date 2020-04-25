package com.example.marvelmovies.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.marvelmovies.R;
import com.example.marvelmovies.list.adapter.YoutubeVideoAdapter;
import com.example.marvelmovies.list.model.YoutubeVideoModel;
import com.example.marvelmovies.list.utils.RecyclerViewOnClickListener;

import java.util.ArrayList;

public class ListYoutubeMainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.youtube_activity);
        setUpRecyclerView();
        populateRecyclerView();

    }

    /**
     * setup the recyclerview here
     */
    private void setUpRecyclerView() {
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    /**
     * populate the recyclerview and implement the click event here
     */
    private void populateRecyclerView() {
        final ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = getVideoList();
        YoutubeVideoAdapter adapter = new YoutubeVideoAdapter(this, youtubeVideoModelArrayList);
        recyclerView.setAdapter(adapter);

        //set click event
        recyclerView.addOnItemTouchListener(new RecyclerViewOnClickListener(this, new RecyclerViewOnClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {

                //start youtube player activity by passing selected video id via intent
                startActivity(new Intent(ListYoutubeMainActivity.this, YoutubePlayerActivity.class)
                        .putExtra("video_id", youtubeVideoModelArrayList.get(position).getVideoId()));

            }
        }));
    }


    private ArrayList<YoutubeVideoModel> getVideoList() {
        ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = new ArrayList<>();

        String[] videoIDArray = getResources().getStringArray(R.array.video_id_array);
        String[] videoTitleArray = getResources().getStringArray(R.array.video_title_array);
        String[] videoDurationArray = getResources().getStringArray(R.array.video_duration_array);

        for (int i = 0; i < videoIDArray.length; i++) {
            YoutubeVideoModel youtubeVideoModel = new YoutubeVideoModel();
            youtubeVideoModel.setVideoId(videoIDArray[i]);
            youtubeVideoModel.setTitle(videoTitleArray[i]);
            youtubeVideoModel.setDuration(videoDurationArray[i]);
            youtubeVideoModelArrayList.add(youtubeVideoModel);
        }

        return youtubeVideoModelArrayList;
    }
}
