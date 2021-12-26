package ru.netology.manager;

import ru.netology.domain.Poster;

public class PosterManager {
    private Poster[] items = new Poster[0];
    private int limitPosterItem = 10;

    public PosterManager() {
    }

    public PosterManager(int limitPosterItem) {
        this.limitPosterItem = limitPosterItem;
    }


    public void add(Poster item) {
        int length = items.length + 1;
        Poster[] tmp = new Poster[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Poster[] getAll() {
        Poster[] result;
        if (items.length > limitPosterItem) {
            result = new Poster[limitPosterItem];
        } else {
            result = new Poster[items.length];
        }
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}