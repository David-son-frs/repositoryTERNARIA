package Ternaria;

import java.util.Scanner;

public class Ativ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Digite um numero ");
        a = sc.nextInt();
        System.out.println("Digite um numero ");
        b = sc.nextInt();
        String resultado = (a > b) ? "O primeiro numero é maior " : (a < b) ? "O segundo numero é maior " : "Os numeros são iguais";
        System.out.println(resultado);
        sc.close();

    }
}
