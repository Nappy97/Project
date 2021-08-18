package com.nappy.Movie1;


public interface MovieCustomer {


    Movie[] search();

    Movie[] search(String title);

    Movie[] searchDirector(String name);

    Movie[] searchGenre(String genre);

    int getSize();
}




