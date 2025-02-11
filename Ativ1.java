package Ternaria;

import java.util.Scanner;

public class Ativ1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int numero;
            System.out.println("Digite um número ");
            numero = sc.nextInt();
            String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";
            System.out.println(resultado);
            sc.close();
        }
    }

