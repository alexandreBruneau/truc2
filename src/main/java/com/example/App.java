package com.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int salaire = 400;
        int prime = 250;
        int quota = 10;
        System.out.println("Combien de ventes cette semaine ?");
        Scanner clavier = new Scanner(System.in);
        int nbVentes = clavier.nextInt();
        clavier.close();
        if (nbVentes >= 10) {
            salaire = salaire + prime;
            if (nbVentes == 10) {
                System.out.println(
                        "Félicitations ! Vous avez rempli le quota mais tout juste. Votre salaire est de " + salaire
                                + " €.");
            } else {
                System.out
                        .println("Félicitations ! Vous avez rempli le quota. Votre salaire est de " + salaire + " €.");
            }
        } else {
            int nbVentesManquantes = quota - nbVentes;
            System.out.println("Il vous manque " + nbVentesManquantes + " ventes pour atteindre le quota.");
        }
    }
}
