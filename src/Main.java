import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                Bem vindo ao Jogo de advinhação
                O programa irá gerar um numero aleatóriamente
                E
                Você deverá adivinhar um numero inteiro entre 1 a 100
                em 3 tentativas
                                
                Boa sorte ;/
                """);
        int tentativas = 0;
        int numeroAleatorio = new Random().nextInt(100);
        int n = 0;
        String maiorQ;
        String menorQ;
        maiorQ = "Esse numero é maior que o numero gerado...";
        menorQ = "Esse numero é menor que o numero gerado...";

        System.out.println(numeroAleatorio);

        while (tentativas < 3) {
            Scanner numeroDoUsuario = new Scanner(System.in);
            n = numeroDoUsuario.nextInt();
            if (n == numeroAleatorio) {
                System.out.println("Parabéns vc acertou");
                tentativas = 4 ;
            }
            if (tentativas == 3) {
                System.out.println("Suas chances acabaram");
            }
            else {
                if (n > numeroAleatorio) {
                    System.out.println(maiorQ);
                }
                if (n < numeroAleatorio) {
                    System.out.println(menorQ);
                }
                if (tentativas <= 3 ){
                    tentativas++;
                    System.out.println("tentativa: " + tentativas);
                    System.out.println("faltam: " + (3 - tentativas));
                }
            }
            if (tentativas >=3 ) {
                System.out.println("Fim de jogo");
            }

        }
    }
}

