package com.example.vick.mtaa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class AboutActivity extends AppCompatActivity {

    ImageView likeImage, shareimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        likeImage = findViewById(R.id.likeimage);
        shareimage = findViewById(R.id.shareimage);

        likeClicked();
        shareCliked();
    }

    public void likeClicked() {
        likeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                likeImage.animate().rotationBy(360);

            }
        });
    }

    public void shareCliked() {
        shareimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareimage.animate().rotationXBy(360);
            }
        });
    }
}
