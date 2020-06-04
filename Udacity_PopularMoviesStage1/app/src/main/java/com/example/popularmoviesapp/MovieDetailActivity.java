package com.example.popularmoviesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MovieDetailActivity extends AppCompatActivity {

    String movieName;
    String movieRelease;
    String movieRating;
    String movieSyno;
    String movieImage;
    String movieId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        Intent intent = getIntent();
        setTitle(intent.getStringExtra("title"));
        fillDetailActivity(intent);
    }


    private void fillDetailActivity(Intent intent)
    {
        movieName = intent.getStringExtra("title");
        movieRating = intent.getStringExtra("rating");
        movieSyno = intent.getStringExtra("synopsis");
        movieRelease = intent.getStringExtra("date");
        movieImage = intent.getStringExtra("image");
        movieId = intent.getStringExtra("id");

        TextView nameTextView = findViewById(R.id.movieName);
        TextView releaseTextView = findViewById(R.id.movieReleaseDate);
        TextView ratingTextView = findViewById(R.id.movieRating);
        TextView synoTextView = findViewById(R.id.movieSyno);
        ImageView posterImageView = findViewById(R.id.movieImage);

        nameTextView.setText(movieName);
        ratingTextView.setText("Rating : " + movieRating);
        releaseTextView.setText("Release Date : " + movieRelease);
        synoTextView.setText(movieSyno);
        Picasso.get().load(movieImage).into(posterImageView);
    }



}
