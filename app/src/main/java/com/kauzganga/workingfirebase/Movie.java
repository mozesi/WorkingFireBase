package com.kauzganga.workingfirebase;


public class Movie{
    private String title;
    private String actor;
    private String length;

    public Movie(){

    }
    public Movie(String title, String actor, String length) {
        this.title = title;
        this.actor = actor;
        this.length = length;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }
}
