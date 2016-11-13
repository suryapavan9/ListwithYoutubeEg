package com.example.android.listwithyoutubeeg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class ThirdActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    String link;
    YouTubePlayerView youTubePlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Bundle b = getIntent().getExtras();
        link = b.getString(" ");
        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.you_tube);
        youTubePlayerView.initialize("AIzaSyDRq_dG6NT44O6KrbHEo-oM_Sls05q2ySE",this);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
            youTubePlayer.loadVideo(link);
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }
}
