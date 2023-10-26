package org.example.Dziedziczenie;

class Zwierze {
    String imie;
    int wiek;

    public Zwierze(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public void jedz() {
        System.out.println(imie + " je jedzenie dla zwierząt.");
    }

    public void dajGlos() {
        System.out.println(imie + " wydaje dźwięki.");
    }
}
