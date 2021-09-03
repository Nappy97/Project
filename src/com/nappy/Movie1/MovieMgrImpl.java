package com.nappy.Movie1;

import java.util.Arrays;

public class MovieMgrImpl {
    public Theater[] theaters = new Theater[100];
    public int index = 0;

    public MovieMgrImpl() {
    }

    public void addTheater() {
        Theater theater = new Theater();
        theater.setNum(index);
        theaters[index] = theater;
        System.out.println(index + "번 영화관이 정상적으로 등록되었습니다");
        index++;

    }

    public int totalTheater() {
        return index;
    }

    public void addMovie(String title, String director, int grade, String summery, int theaterNum) {
        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setDirector(director);
        movie.setGrade(grade);
        movie.setSummary(summery);

        theaters[theaterNum].movie = movie;
        printMovie(theaters[theaterNum]);
    }

    public void printMovie(Theater theater) {
        String T = theater.movie.getTitle();
        String theaterNum = String.valueOf(theater.num);
        System.out.println(T + theaterNum);
    }

    public void delete(String title) {
        int count = 0;
        for (Movie m : theaters) {
            if (m == null) continue;
            else if (m.getDirector().equals(title)) count++;
        }

        Movie[] ms = new Movie[index - count];
        int idx = 0;
        for (Movie m : theaters) {
            if (m == null) continue;
            else if (m.getTitle().equals(title)) continue;
            else ms[idx++] = m;
        }

        System.out.println(Arrays.toString(ms));
    }


}




