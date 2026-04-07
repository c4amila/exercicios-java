package exercicio16;

import java.util.Scanner;

public class exe16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o um número inteiro: ");
        int num = sc.nextInt();

        String diaSemana = switch (num){
            case 1 -> "domingo";
            case 2 -> "segunda-feira";
            case 3 -> "terça-feira";
            case 4 -> "quarta-feira";
            case 5 -> "quinta-feira";
            case 6 -> "sexta-feira";
            case 7 -> "sábado";
            default -> "dia inválido";
        };

        System.out.println(diaSemana);

        segundaOpcao();//roda a segunda sugestao de codigo

        sc.close();
    }

    public static void segundaOpcao(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o um número inteiro: ");
        int num2 = sc.nextInt();

        String[] dias = {"Domingo",
                "Segunda-feira",
                "Terça-feira",
                "Quarta-feira",
                "Quinta-feira",
                "Sexta-feira",
                "Sábado"
        };

        if (num2 >= 1 && num2 <= 7){
            System.out.println(dias[num2 -1]); //subtrai um pois o array inicia no indice 0
        }else{
            System.out.println("Dia inválido.");
        }

        sc.close();
    }
}
