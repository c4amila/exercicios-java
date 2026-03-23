package exercicio12;

import java.util.Scanner;

public class exe12 {
    //continuação do exercicio 6, mais aprimorado
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um caractere: ");
        char caract = sc.next().toLowerCase().charAt(0);

        if (caract >= 'a' && caract <= 'z'){
            if (caract == 'a' || caract == 'e' || caract == 'i' || caract == 'o' || caract == 'u'){
                System.out.println("Vogal");
            }else{
                System.out.println("Consoante");
            }
        }else if (caract >= '0' && caract <= '9'){
            System.out.println("Número");
        }else{
            System.out.println("Símbolo");
        }

        //testando as duas opcoes
        segundaOpcao();

        sc.close();
    }

    //outra maneira de fazer isto usando a biblioteca java.lang.Character
    public static void segundaOpcao(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um caractere: ");
        char c = sc.next().toLowerCase().charAt(0);

        if (Character.isLetter(c)){
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                System.out.println("Vogal");
            }else{
                System.out.println("Consoante");
            }
        }else if(Character.isDigit(c)){
            System.out.println("Número");
        }else{
            System.out.println("Símbolo");
        }

        sc.close();
    }
}
