package list01.exercicio17;
import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor pago: ");
        double valor = sc.nextDouble();

        int [] notas = {100, 50, 20, 10, 5, 2, 1};
        int [] quantidade = new int[notas.length]; //vazio, porém com mesmo tamanho do outro array

        for(int i = 0; i < notas.length; i++){
            quantidade[i] = (int) (valor / notas[i]); //pega a divisão inteira e coloca dentro do array quantidade
            valor = valor % notas[i]; // pega o resto da divisao para calcular o restante das notas
        }

        for (int i = 0; i < notas.length; i++){
            System.out.println(quantidade[i] + " nota(s) de " + notas[i]);
        }

        sc.close();
    }
}
