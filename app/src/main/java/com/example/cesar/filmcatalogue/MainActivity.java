package com.example.cesar.filmcatalogue;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button_gravity, button_jumanji, button_lion_king, button_star_wars, button_inception, button_toy_story;
    private ImageView posterImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        posterImage = findViewById(R.id.poster_image);

        button_gravity = findViewById(R.id.button_gravity);
        button_jumanji = findViewById(R.id.button_jumanji);
        button_lion_king = findViewById(R.id.button_lion_king);
        button_star_wars = findViewById(R.id.button_star_wars);
        button_inception = findViewById(R.id.button_inception);
        button_toy_story = findViewById(R.id.button_toy_story);

        button_gravity.setOnClickListener(this);
        button_jumanji.setOnClickListener(this);
        button_lion_king.setOnClickListener(this);
        button_star_wars.setOnClickListener(this);
        button_inception.setOnClickListener(this);
        button_toy_story.setOnClickListener(this);
    }

    @Override
    public void onClick(View buttonView) {
        int buttonId = buttonView.getId();
        int imageId;

        switch(buttonId) {
            case R.id.button_gravity:
                imageId = R.drawable.gravity;
                break;
            case R.id.button_jumanji:
                imageId = R.drawable.jumanji;
                break;
            case R.id.button_lion_king:
                imageId = R.drawable.lion_king;
                break;
            case R.id.button_star_wars:
                imageId = R.drawable.star_wars;
                break;
            case R.id.button_inception:
                imageId = R.drawable.origen;
                break;
            case R.id.button_toy_story:
                imageId = R.drawable.toy_story;
                break;
            default:
                imageId = 0;
        }

        if(imageId != 0)
            posterImage.setImageDrawable(ContextCompat.getDrawable(this, imageId));
    }
}
