package com.nappy.Movie1;

public class Movie {
    private String title;
    private String director;
    private String grade;
    private String genre;
    private String summary;

    public Movie() {
    }

    public Movie(String title, String director, int grade, String genre, String summary) {
        super();
        this.title = title;
        this.director = director;
        this.grade = grade;
        this.genre = genre;
        this.summary = summary;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        String title = " 영화제목 : " +  this.getTitle();
        String director = " 영화감독 : " + this.getDirector();
        String grade = " 영화 등급 : " + this.getGrade();
        String summery = " 영화 요약 : " + this.getSummary();
        String join("\n", title, director, grade, summery);
        return join;
    }

}
