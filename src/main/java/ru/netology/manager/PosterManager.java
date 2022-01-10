package ru.netology.manager;

import ru.netology.domain.Poster;

public class PosterManager {

    private Poster[] posters = new Poster[0];
    private int limitPosters = 10;


    public PosterManager() {
    }

    public PosterManager(int limitPosters) {
        this.limitPosters = limitPosters;
    }

    public void add(Poster poster) {
        int length = posters.length + 1;
        Poster[] tmp = new Poster[length];
        System.arraycopy(posters, 0, tmp, 0, posters.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = poster;
        posters = tmp;
    }

    public Poster[] getAll() {
        Poster[] resultLength;
        if (posters.length > limitPosters) {
            resultLength = new Poster[limitPosters];
        } else {
            resultLength = new Poster[posters.length];
        }
        for (int i = 0; i < resultLength.length; i++) {
            int index = posters.length - i - 1;
            resultLength[i] = posters[index];
        }
        return resultLength;
    }

}
