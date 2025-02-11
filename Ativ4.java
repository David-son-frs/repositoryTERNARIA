package Ternaria;

import java.util.Scanner;

public class Ativ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite numero ");
        numero = sc.nextInt();
        String resultado = (numero / 5 == 0) ? "é multiplo de 5" : "Não é multiplo de 5";
        sc.close();
    }
}