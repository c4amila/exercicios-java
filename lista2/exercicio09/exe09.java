package exercicio09;

public class exe09 {
    public static void main(String[] args){

        System.out.println("Soma de todos os números ímpares e múltiplos de três");
        int soma = 0;
        for (int i = 1; i <= 500; i++){
            if (i % 2 != 0 && i % 3 == 0){
                soma += i;
            }
        }

        System.out.println("-> " + soma);
    }
}
