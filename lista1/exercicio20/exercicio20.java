package list01.exercicio20;

import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor equivalente ao mês (1 a 12): ");
        int mes = sc.nextInt();

        //usando switch expressions
        int dias = switch(mes){
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9 ,11 -> 30;
            case 2 -> 28;
            default -> -1;
        };

        if(dias != -1){
            System.out.println("O mês " + mes + " tem " + dias + " dias");

        }else{
            System.out.println("mês inválido");
        }
        
        sc.close();
    }
}
