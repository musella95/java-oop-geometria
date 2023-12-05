package org.lessons.java.geometria;

public class Rettangolo {

        //ATTRIBUTI
        int altezza;
        int base;
        //COSTRUTTORE

        Rettangolo(int altezza, int base){
            this.altezza=altezza;
            this.base=base;
        }
        //METODO X CALCOLARE L'ARIA
        int calocoloAria(){
            return base * altezza;
        }
        //METODO X CALCOLARE IL PERIMETERO
        int calcoloPerimetro(){
            return (2*base)+(2*altezza);
        }
        //METODO X DISEGNARE RETTANGOLO IN CONSOLE
    public void disegna(){
        for (int i = 0; i <base ; i++) {
            System.out.print('o');
        }
        System.out.println();
        for (int j = 0; j <altezza - 1 ; j++) {
            System.out.print('o');
            for (int i = 0; i<base - 1; i++) {
            System.out.println(' ');
            }
        }
        for (int j = 0; j <base ; j++) {
            System.out.print('o');
        }
    }
       

}


