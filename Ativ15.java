package Ternaria;

import java.util.Scanner;

public class Ativ15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        String resultado = (numero % 3 == 0 && numero % 5 == 0) ? "FizzBuzz" : String.valueOf(numero);
        System.out.println(resultado);
        sc.close();
    }
}
