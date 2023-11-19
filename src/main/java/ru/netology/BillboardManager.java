package ru.netology;

public class BillboardManager {

    private Billboard[] films = new Billboard[0];
    private int limitFilms; // количество фильмов по умолчанию

    public BillboardManager(int limitFilms) { // конструктор вывода количества фильмов по желанию
        this.limitFilms = limitFilms;
    }

    public BillboardManager() {  // конструктор вывода количества фильмов по умолчанию
        this.limitFilms = 5;
    }

    public void addFilm(Billboard film) { // добавление нового фильма
        Billboard[] tmp = new Billboard[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Billboard[] getFilms() { // геттер
        return films;
    }

    public Billboard[] findAll() { // вывод фильмов в порядке добавления
        return films;
    }

    public Billboard[] findLast() { // вывод фильмов в обратном порядке
        int resultLength;
        if (films.length < limitFilms) {
            resultLength = films.length;
        } else {
            resultLength = limitFilms;
        }
        Billboard[] result = new Billboard[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = films[films.length - 1 - i];
        }
        return result;
    }
}