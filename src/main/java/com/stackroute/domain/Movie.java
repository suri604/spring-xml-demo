package com.stackroute.domain;

public class Movie {
    private Actor Akki;

    public void setAkki(Actor akki) {
        this.Akki = akki;
    }

    public void getAkki() {
        Akki.display();
    }
}
