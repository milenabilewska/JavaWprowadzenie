package org.example.Dziedziczenie;

public class DziedziczenieExample {
    public static void main(String[] args) {
        Pies pies = new Pies("Pies", 3);
        Kot kot = new Kot("Kot", 2);

        pies.jedz();
        pies.dajGlos();
        pies.aportuj();


        //mmmmm

        kot.jedz();
        kot.dajGlos();
        kot.polujNaMyszy();
    }
}
