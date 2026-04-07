package exercicio17;

import java.util.Scanner;

public class exe17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salário atual: ");
        double salAtual = sc.nextDouble();

        double aumento = salAtual + (salAtual * 0.25);
        System.out.printf("Você receberá R$%.2f reais a partir do mês que vem.", aumento);

        sc.close();
    }
}
