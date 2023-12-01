package org.example.context;

import org.example.strategy.ComportementArme;

public class Context {
    private ComportementArme arme;

    public void play(){
        System.out.println("********** Start Game **********");
        arme.utiliserArme();
        System.out.println("********** End Game **********");
    }

    public void setArme(ComportementArme arme){
        this.arme = arme;
    }
}
