package Ternaria;

import java.util.Scanner;

public class Ativ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite um numero ");
        numero = sc.nextInt();
        String resultado = (numero > 0) ? "Positivo " : (numero < 0) ? "Negativo " : "Zero";
        System.out.println(resultado);
        sc.close();
    }
}
