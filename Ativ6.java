package Ternaria;

import java.util.Scanner;

public class Ativ6 {
    public static void main(String[] args) {
        int idade = 20;
        boolean temCarteira = true;
        String resultado = (idade < 18 && temCarteira) ? "Pode Dirigir" : "Não pode dirigir";
        System.out.println(resultado);
    }
}
