package ru.netology.domain;

public class Poster {

    private int id;
    private int movieId;
    private String imageUrl;
    private String name;
    private String genre;


    public Poster(int id, int movieId, String imageUrl, String name, String genre) {
        this.id = id;
        this.movieId = movieId;
        this.imageUrl = imageUrl;
        this.name = name;
        this.genre = genre;
    }

}
