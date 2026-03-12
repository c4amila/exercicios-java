package exercicio10;

import java.util.Scanner;

public class exe10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de litros vendidos: ");
        double litrosVendidos = sc.nextDouble();

        System.out.println("Digite o tipo do combustível: ");
        System.out.println("A- Álcool \nG- Gasolina");
        char tipo = sc.next().toUpperCase().charAt(0);

        //preço gasolina = 2,70 alcool = 1,90
        double gasolina = 2.70;
        double alcool = 1.90;

        double desconto = 0;

        if (tipo == 'G'){
            if (litrosVendidos <= 25.00){
                desconto = litrosVendidos * (gasolina * 0.97); //3%, 100% - 3% = 97%
            }else{
                desconto = litrosVendidos * (gasolina * 0.95);//5%, 100% - 5% = 95%
            }
        }else if(tipo == 'A'){
            if (litrosVendidos <= 25){
                desconto = litrosVendidos * (alcool * 0.98); //2%, 100% - 2% = 98%
            }else{
                desconto = litrosVendidos * (alcool * 0.96);//4%, 100% - 4% = 96%
            }
        }else{
            System.out.println("Escolha um tipo válido!");
        }

        //usando text blocks para mostrar resultado
        //%s para textos e %.2f para casas decimais
        System.out.printf("""
                -------------------------------
                Combustível: %s
                Litros: %.2f
                Valor final a pagar: R$%.2f
                -------------------------------
                """, (tipo == 'G' ? "Gasolina" : "Álcool"), litrosVendidos, desconto);

        sc.close();
    }
}
