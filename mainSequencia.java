
import java.util.Scanner;
public class mainSequencia {
    public static void main(String[] args) {
        int opcao;
        int S[] = {0}, T[] = {0};
        Scanner s = new Scanner(System.in);

        do {
            System.out.println("(1) Ler sequência");
            System.out.println("(2) Exibir elementos da sequência");
            System.out.println("(3) Soma dos elementos da sequência");
            System.out.println("(4) Produto simples");
            System.out.println("(5) Intercala");
            System.out.println("(6) SAIR\n");
            opcao = s.nextInt();

            if (opcao == 1) {
                System.out.println("Informe a quantidade de elementos do Vetor: ");
              S = sequencia.leSequencia(s.nextInt());
            } else if (opcao == 2) {
                System.out.println("(1) Exibir impares");
                System.out.println("(2) Exibir pares");
                System.out.println("Exibir vetor");
                sequencia.exibeElementos(S, s.nextInt());
            } else if (opcao == 3) {
                sequencia.somaSequencia(S);

            } else if (opcao == 4) {
                sequencia.produtoSimples(S);

            } else if (opcao == 5) {
                System.out.println("Informe o vetor T:");
                T = sequencia.leSequencia(S.length);
                sequencia.intercala(S, T);
            }
        } while (opcao != 6);
        System.out.println("O Programa foi finalizado!");
        s.close();
    }
}