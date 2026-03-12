package exercicio04;

import java.util.Scanner;

public class exe04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int a = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        int b = sc.nextInt();

        //a precisa ser um valor diferente de 0
        if (a != 0){
            // ax + b = 0
            //isaolando x
            // x = - b/a
            int x = -b / a;
            System.out.println("A raiz da equação é: " + x);

        }else{
            System.out.println("A precisa ser diferente de zero.");
        }

        sc.close();
    }
}
