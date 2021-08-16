package com.nappy.Movie;

import java.util.Arrays;
import java.util.Scanner;

import com.nappy.Movie.Movie;

public class MovieCusImple implements MovieCustomer {
    static String[] S = new String[10];
    static String[] A = new String[15];
    static String[] B = new String[20];
    Scanner sc = new Scanner(System.in);

    public void ssSet() {
        for (int i = 0; i < S.length; i++)
            S[i] = "---  ";
    }

    public void aaSet() {
        for (int i = 0; i < A.length; i++)
            A[i] = "---  ";
    }

    public void bbSet() {
        for (int i = 0; i< B.length; i++)
            B[i] = "---  ";
    }

    public void ss(){
        String name;
        int num;
        for(int i=0; i<1; i++){
            System.out.println("S>>");
            for(int k=0;k<S.length;k++)
                System.out.println(S[k]);
        }
        System.out.println("\n이름>>");
        name = sc.next();
        System.out.println("번호>>");
        num = sc.nextInt();
        S[num] = name;
    }

    public void aa() {
        String name;
        int num;
        for(int i =0; i<1; i++){
            System.out.println("A>>");
            for(int k=0; k<A.length;k++)
                System.out.println(A[k]);
        }
        System.out.println("\n이름>>");
        name = sc.next();
        System.out.println("번호>>");
        num = sc.nextInt();
        A[num] = name;
    }

    public void bb(){
        String name;
        int num;
        for(int i=0;i<1; i++){
            System.out.println("B>>");
            for(int k = 0; k< B.length; k++)
                System.out.println(B[k]);
        }
        System.out.println("\n이름>>");
        name=sc.next();
        System.out.println("번호>>");
        num=sc.nextInt();
        B[num] = name;
    }

    private Movie[] movies = new Movie[100];
    private int index;
    private static com.nappy.Movie.MovieCusImple cus = new com.nappy.Movie.MovieCusImple();

    MovieCusImple() {
    }

    public static com.nappy.Movie.MovieCusImple getInstance() {
        return cus;
    }

    public Movie[] search() {
        Movie[] ms = new Movie[index];
        for (int i = 0; i < index; i++) {
            if (movies[i] != null) {
                ms[i] = movies[i];
            }
        }
        return ms;
    }

    public Movie[] search(String title) {
        int i = 0;
        int count = 0;
        Movie[] ms = new Movie[index];
        for (Movie m : movies) {
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

    public int getSize() {
        return index;
    }
}

