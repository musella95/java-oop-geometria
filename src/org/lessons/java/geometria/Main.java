package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dammi la base");
        int userBase = Integer.parseInt(scanner.nextLine());
        System.out.println("Dammi l'altezza");
        int userAltezza = Integer.parseInt(scanner.nextLine());
        Rettangolo myRettangolo = new Rettangolo(userAltezza,userBase);
        System.out.println("questo è il perimetro: " + myRettangolo.calcoloPerimetro());
        System.out.println("questa è l'aria" + myRettangolo.calocoloAria());
        System.out.println("questo è il rettangolo che esce fuori");
        myRettangolo.disegna();
        scanner.close();
    }
}