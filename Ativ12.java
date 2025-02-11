package Ternaria;

import java.util.Scanner;

public class Ativ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        String resultado = (numero % 2 == 0)
                ? (numero > 0 ? "Par e Positivo" : (numero < 0 ? "Par e Negativo" : "Par e Zero"))
                : (numero > 0 ? "Ímpar e Positivo" : (numero < 0 ? "Ímpar e Negativo" : "Ímpar e Zero"));

        System.out.println(resultado);

        sc.close();

    }
}
