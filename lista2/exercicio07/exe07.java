package exercicio07;

import java.util.Scanner;

public class exe07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        double salario = sc.nextDouble();

        double descontoPrev = salario * 0.11;
        double descontoFinal = Math.min(descontoPrev, 334.29);

        double salarioComDesconto = salario - descontoFinal;

        System.out.println("Salário inicial: " + salario);
        System.out.println("Desconto previdenciário: " + descontoFinal);
        System.out.println("Salário final: " + salarioComDesconto);

        sc.close();
    }
}
