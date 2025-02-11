package Ternaria;

import java.util.Scanner;

public class Ativ10 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Digite um numero ");
        a = sc.nextInt();
        String resultado = (a > 100) ? "Alto" : "Baixo";
        System.out.println(resultado);
        sc.close();
    }
}
