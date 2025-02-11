package Ternaria;

public class Ativ5 {
    public static void main(String[] args) {
        int ano = 2024;
        String resultado = (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) ? "Bissexto" : "Não Bissexto";
        System.out.println(resultado);

    }
}
