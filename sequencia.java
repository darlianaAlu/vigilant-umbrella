import java.util.*;

public class sequencia {

    public static int[] leSequencia(int N) {

        Random x = new Random();
        int S[] = new int[N];

        for (int i = 0; i < N; i++) {
            S[i] = x.nextInt(1000);
            System.out.println(S[i]);
        }
        return S;
    }
    
    public static void exibeElementos(int S[], int x) {

        if (x == 1) {
            for (int i = 0; i < S.length; i++) {
                if (S[i] % 2 == 1) {
                    System.out.print(S[i] + " ");
                }                
            }  
            System.out.println();
        } else if (x == 2) {
            for (int i = 0; i < S.length; i++) {
                if (S[i] % 2 == 0) {
                    System.out.print(S[i] + " ");                    
                }
            }
            System.out.println();
        } else if (x == 3) {
            for (int i = 0; i < S.length; i++) {
                System.out.print(S[i] + " ");
            }
        }
            System.out.println();
    }
    
    public static int somaSequencia(int S[]) {
        int soma = 0;
        for (int i = 0; i < S.length; i++) {
            soma += S[i];
        }
        return soma;
    }

    public static int produtoSimples(int S[]) {
        int produto = 0;
        for (int i = 0; i < S.length; i++) {
            produto *= S[i];
        }
        return produto;
    }

    public static void intercala(int S[], int T[]) {
        int R[] = {S.length + T.length}, i, j;

        for (i = 0; i < R.length; i += 2) {
            R[i] = S[i];
        }

        for (j = 1; j < R.length - 1; j += 2) {
            R[i] = T[j];
        }
        System.out.println(i + 1 + "° elemento" + R[i]);
    }
}
