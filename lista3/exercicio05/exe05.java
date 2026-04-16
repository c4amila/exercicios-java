package exercicio05;

import java.util.Scanner;

public class exe05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[10];

        System.out.println("Digite 10 valores: ");
        for (int i = 0; i < valores.length; i++){
            valores[i] = sc.nextInt();
        }

        System.out.println("Selecione uma das opções para ordenar o vetor:\n");
        System.out.println("1- Crescente");
        System.out.println("2- Descrescente");
        int opcao = sc.nextInt();

        for (int i = 0; i < valores.length; i++){
            for (int j = i + 1; j < valores.length; j++){
                if (valores[i] > valores[j]){
                    int temporario = valores[i];
                    valores[i] = valores[j];
                    valores[j] = temporario;
                }
            }
        }

        System.out.println("Vetor ordenado: ");
        for (int ordenado : valores){
            System.out.println(ordenado + " ");
        }

        sc.close();
    }
}
