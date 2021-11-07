import java.util.Scanner;

public class IfJava {
  public static void main(String[] args) {
    
  Scanner leitura = new Scanner(System.in);

  int num;
  int par = 0;

  do {
    num = leitura.nextInt();
    if ((num % 2) == 0) 
    // O sinal % traz o resto da divisão
    {
      System.out.println("Número par detectado");
      par++;  
    }
    else
    {
      System.out.println("Número ímpar dectado");
    }
  }while (num != -1);
  // O sinal de diferente no Java é !=

  System.out.println("Você digitou " + par + " número(s) par(es).");  
  }
}