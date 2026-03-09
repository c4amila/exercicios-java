package list01.exercicio19;

import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da mercadoria: ");
        double valor = sc.nextDouble();

        int prestacoes = (int) (valor / 3); //casting int, para pegar apenas a parte inteira da divisao
        double entrada = valor - (prestacoes * 2);

        System.out.printf("Entrada: R$%.2f%n", entrada);
        System.out.printf("Prestações: 2 de R$%d,00%n", prestacoes);

        sc.close();
    }
}
