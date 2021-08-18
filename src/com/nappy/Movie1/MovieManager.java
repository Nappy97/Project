package com.nappy.Movie1;


public interface MovieManager {
    Movie[] search();
    Movie[] search(String title);
    Movie[] searchDirector(String name);
    Movie[] searchGenre(String genre);
    void delete(String title);
    int getSize();
}
