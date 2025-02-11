package Ternaria;

import java.util.Scanner;

public class Ativ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um caractere: ");
        char caractere = sc.next().toLowerCase().charAt(0);

        String resultado = (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') ? "Vogal" : "Consoante";
        System.out.println(resultado);

        sc.close();
    }
}
