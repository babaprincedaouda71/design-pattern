package org.example.strategy;

public class ComportementHache implements ComportementArme {
    @Override
    public void utiliserArme() {
        System.out.println("********* Je te Hache ********");
    }
}
