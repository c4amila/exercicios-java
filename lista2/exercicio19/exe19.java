package exercicio19;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exe19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano: ");
        int ano = sc.nextInt();

        if (ehBissexto(ano)){
            System.out.println("O ano " + ano + " é bissexto");
        }else {
            System.out.println("O ano " + ano + " não é bissexto");
        }

        sc.close();
    }

    public static boolean ehBissexto(int ano){
        return (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 !=0);
    }
}
