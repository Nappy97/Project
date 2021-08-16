package com.nappy.Movie;

import com.nappy.Movie.Movie;


public interface MovieCustomer {

    Movie[] search();

    Movie[] search(String title);

    Movie[] searchDirector(String name);

    Movie[] searchGenre(String genre);

    int getSize();
}

