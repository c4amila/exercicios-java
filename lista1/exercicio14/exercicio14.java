package list01.exercicio14;
import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        System.out.println("Digite o terceiro numero: ");
        int num3 = sc.nextInt();

        int maior = num1;
        if(num2 > maior){
            maior = num2;
        }
        if(num3 > maior){
            maior = num3;
        }

        if(num2 == maior || num3 == maior){
            System.out.println("são iguais");
        }

        System.out.println("O maior número é: " + maior);

        sc.close();
    }
}
