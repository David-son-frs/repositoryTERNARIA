package Ternaria;

import java.util.Scanner;

public class Ativ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("DIgite o numero");
        int numero = sc.nextInt();
        String resultado = (numero > 0) ? "Positivo" : "negativo";
        String Parimpar = (numero / 2 == 0) ? "Par" : "Impar";
        System.out.printf(resultado+" e é "+ Parimpar);
        sc.close();
    }
}
