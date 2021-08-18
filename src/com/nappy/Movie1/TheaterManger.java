package com.nappy.Movie1;

import com.nappy.Movie.Theater;

import java.util.ArrayList;

public class TheaterManger extends Theater {
    private int index;
    static ArrayList<Theater> theaters = new ArrayList<Theater>(100);
    static boolean ans = theaters.isEmpty();

    public void add(Theater t) {
        Theater[] theaters = new Theater[100];
        theaters[index++] = t;
    }
}
