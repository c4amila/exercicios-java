package list01.exercicio18;

import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int a = sc.nextInt();

        System.out.println("Digite o valor de B: ");
        int b = sc.nextInt();

        int aux = a; //guarda o primeiro valor na auxiliar
        a = b;
        b = aux; //pega o valor antigo de A

        System.out.println("A: " + a);
        System.out.println("B: " + b);

        sc.close();
    }
}
