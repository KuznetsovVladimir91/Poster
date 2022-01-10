package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Poster;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {

    PosterManager manager = new PosterManager();

    @Test
    void shouldAddTheLastTenMovies() {

        Poster first = new Poster(1, 11, "a", "firstName", "comedy");
        Poster second = new Poster(1, 11, "b", "firstName", "comedy");
        Poster third = new Poster(1, 11, "c", "firstName", "comedy");
        Poster fourth = new Poster(1, 11, "d", "firstName", "comedy");
        Poster fifth = new Poster(1, 11, "i", "firstName", "comedy");
        Poster sixth = new Poster(1, 11, "f", "firstName", "comedy");
        Poster seventh = new Poster(1, 11, "g", "firstName", "comedy");
        Poster eighth = new Poster(1, 11, "h", "firstName", "comedy");
        Poster ninth = new Poster(1, 11, "u", "firstName", "comedy");
        Poster tenth = new Poster(1, 11, "k", "firstName", "comedy");
        Poster eleventh = new Poster(1, 11, "l", "firstName", "comedy");

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

        manager.getAll();

        Poster[] actual = manager.getAll();
        Poster[] expected = new Poster[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        assertArrayEquals(expected, actual);

    }

    @Test
    void shouldAddAllFilmsIfThereAreLessThanTen() {

        Poster first = new Poster(1, 11, "a", "firstName", "comedy");
        Poster second = new Poster(1, 11, "b", "firstName", "comedy");
        Poster third = new Poster(1, 11, "c", "firstName", "comedy");


        manager.add(first);
        manager.add(second);
        manager.add(third);


        manager.getAll();

        Poster[] actual = manager.getAll();
        Poster[] expected = new Poster[]{third, second, first};

        assertArrayEquals(expected, actual);

    }

    @Test
    void shouldAddFiveMovies() {

        PosterManager manager = new PosterManager(5);

        Poster first = new Poster(1, 11, "a", "firstName", "comedy");
        Poster second = new Poster(1, 11, "b", "firstName", "comedy");
        Poster third = new Poster(1, 11, "c", "firstName", "comedy");
        Poster fourth = new Poster(1, 11, "d", "firstName", "comedy");
        Poster fifth = new Poster(1, 11, "i", "firstName", "comedy");
        Poster sixth = new Poster(1, 11, "f", "firstName", "comedy");
        Poster seventh = new Poster(1, 11, "g", "firstName", "comedy");
        Poster eighth = new Poster(1, 11, "h", "firstName", "comedy");
        Poster ninth = new Poster(1, 11, "u", "firstName", "comedy");
        Poster tenth = new Poster(1, 11, "k", "firstName", "comedy");
        Poster eleventh = new Poster(1, 11, "l", "firstName", "comedy");

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

        manager.getAll();

        Poster[] actual = manager.getAll();
        Poster[] expected = new Poster[]{eleventh, tenth, ninth, eighth, seventh};

        assertArrayEquals(expected, actual);

    }

}