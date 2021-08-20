package com.nappy.Movie1;

import java.util.*;

public class Theater extends Movie{
    public int num;
    public Movie movie;
    public char[][] sheets = new char [10][10];
    public Theater() {
    }

    public Theater(int num) {
        super();
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

