package exercicio18;

import java.util.Scanner;

public class exe18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("---Custos de pulverização---\n");
        System.out.println("1- ervas daninhas R$50,00 por acre");
        System.out.println("2- gafanhotos R$ 100,00 por acre");
        System.out.println("3- broca R$ 150,00 por acre");
        System.out.println("4- todos acima R$ 250,00 por acre\n");

        System.out.println("Digite o tipo de pulverização: ");
        int opcao = sc.nextInt();

        System.out.println("Digite o tamanho da área a ser pulverizada: ");
        int area = sc.nextInt();

        double precoAcre = 0;
        switch (opcao){
            case 1:
                precoAcre = 50.0;
                break;
            case 2:
                precoAcre = 100.0;
                break;
            case 3:
                precoAcre = 150.0;
                break;
            case 4:
                precoAcre = 250.0;
                break;
            default:
                System.out.println("Tipo inválido");
        }

        double custo = (double) area * precoAcre;
        if (area > 1000){//5% desconto
            custo = custo * 0.95;
        }

        if (custo > 750.0){//10% desconto
            double valorUltrapassado = custo - 750;
            double desconto = valorUltrapassado * 0.10;
            custo = custo - desconto;
        }

        System.out.printf("Valor final: %.2f reais", custo);
        sc.close();
    }
}
