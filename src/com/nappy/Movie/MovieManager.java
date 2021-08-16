package com.nappy.Movie;

import com.nappy.Movie.Movie;

public interface MovieManager {
    void add(Movie m);
    Movie[] search();
    Movie[] search(String title);
    Movie[] searchDirector(String name);
    Movie[] searchGenre(String genre);
    void delete(String title);
    int getSize();
}
