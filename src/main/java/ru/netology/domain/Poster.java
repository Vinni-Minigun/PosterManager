package ru.netology.domain;

public class Poster {
    private int id;
    private int MovieId;
    private String MovieName;
    private String MovieGenre;

    public Poster(int id, int movieId, String movieName, String movieGenre) {
        this.id = id;
        MovieId = movieId;
        MovieName = movieName;
        MovieGenre = movieGenre;
    }
}