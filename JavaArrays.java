import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class JavaArrays {

    public static void altera_nota (int notas[], int n){
        for (int i = 0; i < n; i++) {
            notas[i] += 10;
        }
    }
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        double soma = 0;
        double media = 0;
        // vetor é criado e determinado um tamnanho com a sintaxe "new"
        int notas [] = new int [5];
        int n = 5;

        System .out.println();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite a nota do aluno: ");
            notas[i] = leitura.nextInt();

            soma += notas[i];
        }

        System .out.println();

        for (int i = 0; i < n; i++) {
            System.out.print(notas[i] + " ");
            
        }

        System .out.println();

        altera_nota (notas, n);

        for (int nota : notas){
            System.out.print(nota + " ");
        }

        System .out.println();

        media = soma / n;

        System .out.println("Resultado: " + media);

    }
    
}
