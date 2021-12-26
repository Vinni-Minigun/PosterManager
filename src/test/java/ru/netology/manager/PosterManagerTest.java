package ru.netology.manager;

import org.junit.jupiter.api.Test;

import ru.netology.domain.Poster;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {
    @Test
    public void displayLastTenMovies() {
        PosterManager manager = new PosterManager();

        Poster first = new Poster(1, 238634, "Movie first", "horror");
        Poster second = new Poster(2, 397412, "Movie second", "fantasy");
        Poster third = new Poster(3, 393236, "Movie third", "action");
        Poster fourth = new Poster(4, 104389, "Movie fourth", "crime");
        Poster fifth = new Poster(5, 326608, "Movie fifth", "drama");
        Poster sixth = new Poster(6, 457112, "Movie sixth", "cartoon");
        Poster seventh = new Poster(7, 907159, "Movie seventh", "comedy");
        Poster eighth = new Poster(8, 246100, "Movie eighth", "fantasy");
        Poster ninth = new Poster(9, 908472, "Movie ninth", "action");
        Poster tenth = new Poster(10, 172543, "Movie tenth", "western");
        Poster eleventh = new Poster(11, 385145, "Movie eleventh", "action");
        Poster twelve = new Poster(12, 504162, "Movie twelve", "fantasy");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelve);

        manager.getAll();

        Poster[] actual = manager.getAll();
        Poster[] expected = new Poster[]{twelve, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third};


        assertArrayEquals(expected, actual);
    }

    @Test
    public void displayLastMoviesLessTen() {
        PosterManager manager = new PosterManager();

        Poster first = new Poster(1, 238634, "Movie first", "horror");
        Poster second = new Poster(2, 397412, "Movie second", "fantasy");
        Poster third = new Poster(3, 393236, "Movie third", "action");
        Poster fourth = new Poster(4, 104389, "Movie fourth", "crime");


        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);

        manager.getAll();

        Poster[] actual = manager.getAll();
        Poster[] expected = new Poster[]{fourth, third, second, first};


        assertArrayEquals(expected, actual);
    }

    @Test
    public void displayThreeMovies() {
        PosterManager manager = new PosterManager(3);

        Poster first = new Poster(1, 238634, "Movie first", "horror");
        Poster second = new Poster(2, 397412, "Movie second", "fantasy");
        Poster third = new Poster(3, 393236, "Movie third", "action");
        Poster fourth = new Poster(4, 104389, "Movie fourth", "crime");
        Poster fifth = new Poster(5, 326608, "Movie fifth", "drama");
        Poster sixth = new Poster(6, 457112, "Movie sixth", "cartoon");
        Poster seventh = new Poster(7, 907159, "Movie seventh", "comedy");
        Poster eighth = new Poster(8, 246100, "Movie eighth", "fantasy");
        Poster ninth = new Poster(9, 908472, "Movie ninth", "action");
        Poster tenth = new Poster(10, 172543, "Movie tenth", "western");
        Poster eleventh = new Poster(11, 385145, "Movie eleventh", "action");
        Poster twelve = new Poster(12, 504162, "Movie twelve", "fantasy");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelve);

        manager.getAll();

        Poster[] actual = manager.getAll();
        Poster[] expected = new Poster[]{twelve, eleventh, tenth};

        assertArrayEquals(expected, actual);
    }
}