package org.example;

import org.example.context.Context;
import org.example.personnage.Personnage;
import org.example.personnage.Roi;
import org.example.strategy.ComportementArme;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
//        Personnage personnage = new Roi();
        Context context = new Context();
        while (true){
            System.out.print("What Strategy? : ");
            String strategyClassName = scanner.nextLine();
            ComportementArme strategy = (ComportementArme) Class.forName(strategyClassName).getConstructor().newInstance();
            context.setArme(strategy);
            context.play();
        }
    }
}