package list01.exercicio13;

public class exercicio13 {
    public static void main(String[] args){
        double velPermitida = 15;
        double distanciaSemaforo = 500;
        double aceleracao = 2;

        //tempo pra atingir velocidade -> V / a
        double tempoAceleracao = velPermitida / aceleracao;

        //distância percorrida com aceleração -> (a * t^2) / 2
        double distanciaAceleracao = (aceleracao * Math.pow(tempoAceleracao, 2)) / 2.0;

        double distanciaRestante = distanciaSemaforo - distanciaAceleracao;
        double tempoConstante = distanciaRestante / velPermitida; //tempo restante
        double tempoTotal = tempoAceleracao + tempoConstante;

        double tempoSemaforo = tempoTotal - 3.0;

        System.out.printf("O próximo sinal irá abrir após %.2f segundos", tempoSemaforo);

    }
}
