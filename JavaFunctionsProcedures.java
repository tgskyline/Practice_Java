import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class JavaFunctionsProcedures {

  public static double calculadora (int n1, int n2, String op){

    double resultado = 0;

    switch (op) {
        case "+":
          resultado = n1 + n2;
          break;
        case "-":
          resultado = n1 - n2;
          break;
        case "x":
          resultado = n1 * n2;
          break;
        case "/":
          resultado = n1 / n2;
          break;
        default:
          System.out.println("Operação desconhecida");
        }  
        return resultado;
  }
  public static void main(String[] args) {
    
  Scanner leitura =new Scanner(System.in);

  int n1, n2;
  String op;

  System.out.println("\nDigite: o operando 1: ");
  n1 = leitura.nextInt();
  
  System.out.println("\nDigite: o operando 2: ");
  n2 = leitura.nextInt();

  System.out.println("\nDigite: o operação ( +, -, x, ou /: ");
  op = leitura.next();
  
  double resultado = calculadora (n1, n2, op);
  
  System.out.println("Resultado: " + resultado);

  System.out.println();

  }  
}
