package org.example.strategy;

public class ComportementPoignard implements ComportementArme {
    @Override
    public void utiliserArme() {
        System.out.println("---------- Je te Poignarde ---------");
    }
}
