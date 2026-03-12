package exercicio06;

import java.util.Scanner;

public class exe06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        char letra = sc.next().toLowerCase().charAt(0);

        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        boolean ehVogal = false;

        for (int i = 0; i < vogais.length; i++){ //percorre o array de caracteres
            if (letra == vogais[i]){ //e verifica se a letra escolhida é igual as vogais do array
                ehVogal = true;
                break;
            }
        }

        if (ehVogal){
            System.out.println("É uma vogal");
        }else{
            System.out.println("É uma consoante");
        }

        sc.close();
    }
}
