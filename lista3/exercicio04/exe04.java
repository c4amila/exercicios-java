package exercicio04;

import java.util.Scanner;
import java.util.Stack;//usando pilhas

public class exe04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine().trim();

        Stack<Character> pilha = new Stack<>();
        //empilha primeiro
        for (int i = 0; i < palavra.length(); i++){
            pilha.push(palavra.charAt(i));
        }

        //desempilha e constroi a invertida
        String invertida = "";
        while(!pilha.isEmpty()){
            invertida += pilha.pop();
        }

        if (invertida.equalsIgnoreCase(palavra)){
            System.out.println("É palindromo");
        }else{
            System.out.println("Não é palindromo");
        }

        sc.close();
    }
}
