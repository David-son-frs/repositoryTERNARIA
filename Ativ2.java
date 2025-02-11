package Ternaria;

import java.util.Scanner;

public class Ativ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        System.out.println("Digite a idade ");
        idade = sc.nextInt();
        String Resposta = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println(Resposta);
        sc.close();
    }
}
