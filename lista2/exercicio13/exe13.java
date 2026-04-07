package exercicio13;

import java.util.Scanner;

public class exe13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int idade;
        int[] faixas = new int[5];
        int cont = 0;

        System.out.println("Digite a idade (-1 para encerrar): ");
        do {
            idade = sc.nextInt();

            if (idade != -1){
                if (idade >= 0 && idade <= 17){//cada posição corresponde a uma faixa etaria
                    faixas[0]++;//incrementa dentro daquela posição
                }else if (idade >= 18 && idade <= 35){
                    faixas[1]++;
                }else if (idade > 35 && idade <= 50){
                    faixas[2]++;
                }else if (idade > 50 && idade <= 65){
                    faixas[3]++;
                }else if (idade > 65){
                    faixas[4]++;
                }

                cont++;//soma o total de idades inseridas
            }

        }while(idade != -1);

        if (cont != 0){
            String[] faixaEtaria = {"0-17", "18-35", "36-50", "51-65", "65 mais"}; //só para enfeitar a saída

            double somaTotal = 0;
            for (int i = 0; i < faixas.length; i++){
                // faixa etária * 100.0 / total de pessoas
                double percentual = (faixas[i] * 100.0) / cont;
                somaTotal += percentual;//soma o percentual para mostrar 100%
                System.out.printf("%s: %.2f%%\n", faixaEtaria[i], percentual);
            }
            System.out.printf("Total: %.1f%%\n", somaTotal);
        }

        sc.close();
    }
}
