package com.nappy.Movie1;

public class Search {
    MovieMgrImpl mgr = new MovieMgrImpl();
    Movie movies = new Movie();
    public Theater[] search() {

        Theater[] ms = new Theater[mgr.index];
        for (int i = 0; i < mgr.index; i++) {
            if (mgr.theaters[i] != null) {
                ms[i] = mgr.theaters[i];
            }
        }
        return ms;
    }

    public Theater[] search(String title) {
        int i = 0;
        int count = 0;
        Theater[] ms = new Theater[mgr.index];
        for (Theater t : mgr.theaters) {
            if (t == null) continue;
            else if (t.getTitle().contains(title)) {
                ms[i++] = t;
                count++;
            }
        }
        Theater[] ms2 = new Theater[count];
        if (count > 0) System.arraycopy(ms, 0, ms2, 0, count);
        return ms2;
    }

    public Theater[] searchDirector(String name) {
        int size = 0;
        for (int i = 0; i < mgr.index; i++) {
            if (mgr.theaters[i] == null) continue;
            else if (mgr.theaters[i].getDirector().equals(name)) size++;
        }

        Theater[] ms = new Theater[size];
        for (int i = 0; i < mgr.index; i++) {
            if (mgr.theaters[i].getDirector().equals(name)) {
                ms[--size] = mgr.theaters[i];
            }
        }
        return ms;
    }

    public Theater[] searchGrade(String genre) {
        int count = 0;
        int i = 0;
        Theater[] ms = new Theater[mgr.index];
        for (Theater t : mgr.theaters) {
            if (t == null) continue;
            else if (t.getGenre().equals(genre)) {
                ms[i++] = t;
                count++;
            }
        }
        Theater[] ms2 = new Theater[count];
        for (int j = 0; j < count; j++) {
            ms2[j] = ms[j];
        }
        return ms2;
    }
}
