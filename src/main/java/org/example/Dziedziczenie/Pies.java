package org.example.Dziedziczenie;

class Pies extends Zwierze {
    public Pies(String imie, int wiek) {
        super(imie, wiek);
    }

    public void aportuj() {
        System.out.println(imie + " aportuje piłkę.");
    }

    // Nadpisanie metody dajGlos() z klasy nadrzędnej
    @Override
    public void dajGlos() {
        System.out.println(imie + " szczeka.");
    }
}
