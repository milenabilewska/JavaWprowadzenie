package org.example.Dziedziczenie;

class Kot extends Zwierze {
    public Kot(String imie, int wiek) {
        super(imie, wiek);
    }

    public void polujNaMyszy() {
        System.out.println(imie + " poluje na myszy.");
    }
}
