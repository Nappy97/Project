package com.nappy.Movie1;

public class Search {
    public int index = 0;
    int i = 0;
    int count = 0;
    Movie movie = new Movie();
    MovieMgrImpl mgr = new MovieMgrImpl();

    for (Movie m : mgr.) {
        if (m == null) continue;
        else if (m.getTitle().contains(title)) {
            ms[i++] = m;
            count++;
        }
    }
    Movie[] ms2 = new Movie[count];
    if (count > 0) System.arraycopy(ms, 0, ms2, 0, count);
    return ms2;
}

    public Movie[] searchDirector(String name) {
        int size = 0;
        for (int i = 0; i < index; i++) {
            if (movies[i] == null) continue;
            else if (movies[i].getDirector().equals(name)) size++;
        }

        Movie[] ms = new Movie[size];
        for (int i = 0; i < index; i++) {
            if (movies[i].getDirector().equals(name)) {
                ms[--size] = movies[i];
            }
        }
        return ms;
    }

    public Movie[] searchGenre(String genre) {
        int count = 0;
        int i = 0;
        Movie[] ms = new Movie[index];
        for (Movie m : movies) {
            if (m == null) continue;
            else if (m.getGenre().equals(genre)) {
                ms[i++] = m;
                count++;
            }
        }
        Movie[] ms2 = new Movie[count];
        for (int j = 0; j < count; j++) {
            ms2[j] = ms[j];
        }
        return ms2;
    }

    public void delete(String title) {
        int count = 0;
        for (Movie m : movies) {
            if (m == null) continue;
            else if (m.getDirector().equals(title)) count++;
        }

        Movie[] ms = new Movie[index - count];
        int idx = 0;
        for (Movie m : movies) {
            if (m == null) continue;
            else if (m.getTitle().equals(title)) continue;
            else ms[idx++] = m;
        }

        System.out.println(Arrays.toString(ms));
    }
}
