package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BillboardManagerTest {
    Billboard film1 = new Billboard(01, "Бладшот", "боевик");
    Billboard film2 = new Billboard(02, "Вперёд", "мультфильм");
    Billboard film3 = new Billboard(03, "Отель «Белград»", "комедия");
    Billboard film4 = new Billboard(04, "Джентльмены", "боевик");
    Billboard film5 = new Billboard(05, "Человек-невидимка", "ужасы");
    Billboard film6 = new Billboard(06, "Тролли. Мировой тур", "мультфильм");
    Billboard film7 = new Billboard(07, "Номер один", "комедия");

    @Test
    public void shouldAddFilm() {
        BillboardManager manager = new BillboardManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        Billboard[] expected = {film1, film2, film3, film4, film5, film6, film7};
        Billboard[] actual = manager.getFilms();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAll() {
        BillboardManager manager = new BillboardManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        Billboard[] expected = {film1, film2, film3, film4, film5, film6, film7};
        Billboard[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastForLengthIn3() {
        BillboardManager manager = new BillboardManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        Billboard[] expected = {film3, film2, film1};
        Billboard[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastForLimitIn4() {
        BillboardManager manager = new BillboardManager(4);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        Billboard[] expected = {film7, film6, film5, film4};
        Billboard[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastForLimit() {
        BillboardManager manager = new BillboardManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        Billboard[] expected = {film7, film6, film5, film4, film3};
        Billboard[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastForLimit6() {
        BillboardManager manager = new BillboardManager(6);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        Billboard[] expected = {film7, film6, film5, film4, film3, film2};
        Billboard[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}