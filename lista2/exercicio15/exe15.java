package exercicio15;

import java.util.Scanner;

public class exe15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a renda mensal: ");
        double rendaMensal = sc.nextDouble();

        System.out.println("Digite o valor total do empréstimo: ");
        double emprestimo = sc.nextDouble();

        System.out.println("Digite o número de prestações para pagar: ");
        int qtdPrestacoes = sc.nextInt();

        double valorPrestacao = emprestimo / qtdPrestacoes;
        if (emprestimo <= rendaMensal * 10 && valorPrestacao <= rendaMensal * 0.3){
            System.out.println("O empréstimo pode ser concebido");
            System.out.printf("Valor da parcela: R$%.2f reais\n", valorPrestacao);
        }else{
            System.out.println("O empréstimo não pode ser concebido");
            System.out.printf("Valor da parcela: R$%.2f reais\n", valorPrestacao);
        }

        sc.close();
    }
}
