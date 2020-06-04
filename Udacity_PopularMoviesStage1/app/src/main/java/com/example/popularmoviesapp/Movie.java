package com.example.popularmoviesapp;

public class Movie {

    private String mMovieName;
    private String mMovieRating;
    private String mMovieImage;
    private String mMovieSynopsis;
    private String mMovieReleaseDate;
    private String mMovieId;



    public Movie(String movieName, String movieRating, String movieImage, String movieSynopsis, String movieReleaseDate, String movieId) {
        mMovieName = movieName;
        mMovieRating = movieRating;
        mMovieImage = movieImage;
        mMovieSynopsis = movieSynopsis;
        mMovieReleaseDate = movieReleaseDate;
        mMovieId = movieId;
    }

    public String getmMovieName() {
        return mMovieName;
    }

    public String getMovieImage() {
        return mMovieImage;
    }


    public String getmMovieRating() {
        return mMovieRating;
    }
    public String getmMovieSynopsis() {
        return mMovieSynopsis;
    }

    public String getmMovieReleaseDate() {
        return mMovieReleaseDate;
    }


    public String getmMovieId() { return mMovieId; }





}

