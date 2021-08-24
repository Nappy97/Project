package com.nappy.Movie1;

import java.util.*;

public class Theater extends Movie {
    public int num;
    public Movie movie;

    int  [][] seats = new int[10][10];

    boolean isRun = true;

    String strColumn;
    char inputColumn;
    int rowNum;
    int [][] reservedNumber = new int [4][5];

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

