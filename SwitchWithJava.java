import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class SwitchWithJava {
  public static void main(String[] args) {
    
  Scanner leitura =new Scanner(System.in);

  int n1, n2;
  String op;

  System.out.println("\nDigite: o operando 1: ");
  n1 = leitura.nextInt();
  
  System.out.println("\nDigite: o operando 2: ");
  n2 = leitura.nextInt();

  System.out.println("\nDigite: o operação ( +, -, *, ou /: ");
  op = leitura.next();
  
  switch (op) {
    case "+":
      System.out.println(n1 + n2);
      break;
    case "-":
      System.out.println(n1 - n2);
      break;
    case "x":
      System.out.println(n1 * n2);
      break;
    case "/":
      System.out.println(n1 / n2);
      break;
    default:
      System.out.println("Operaçõ desconhecida");
    }  
  }  
}
