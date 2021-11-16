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

        
        int n = 3;
        // Matrizes são criadas visualizando como se fosse uma planilha de excel onde o primeiro valor são as linhas e o segundo as colunas
        int matriz [][] = new int [3][3];

        System .out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
            System.out.print("Digite a posição " + i + "," + j + ":");
            matriz[i] [j] = leitura.nextInt();
            }    
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        
        }   
    }
}
