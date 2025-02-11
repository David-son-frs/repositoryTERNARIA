package Ternaria;

import java.util.Scanner;

public class Ativ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();
        int maior = (a > b) ? a : b;
        System.out.println("O maior número é: " + maior);
        sc.close();
    }
}
