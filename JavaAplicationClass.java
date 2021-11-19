import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class JavaAplicationClass {
  
   class Main {
       public static void main(String[] args) {
           
        Scanner Leitura = new Scanner(System.in);

        // Uso da Classe JavaClass

        JavaClass bike = new JavaClass();

        bike.Acelerar(12);

        System.out.println("velocidade da bike é " + bike.consultarVelocidade());

        bike.frear();

        System.out.println("velocidade da bike é " + bike.consultarVelocidade());

        System.out.println();


        // Uso da Classe JavaAccountBank

        JavaAccountBank conta1 = new JavaAccountBank("Tiago", 100);

        JavaAccountBank conta2 = new JavaAccountBank("Braian", 200);
        
        System.out.println("Saldo da conta 1 é " + conta1.getSaldo());
        System.out.println("Saldo da conta 2 é " + conta2.getSaldo());

        conta1.deposita(200);
        conta2.deposita(100);

        System.out.println("Saldo da conta 1 é " + conta1.getSaldo());
        System.out.println("Saldo da conta 2 é " + conta2.getSaldo());  
        
        conta1.retira(100);
        conta2.retira(50);
        
        System.out.println("Saldo da conta 1 é " + conta1.getSaldo());
        System.out.println("Saldo da conta 2 é " + conta2.getSaldo());  

        conta1.deposita(conta2.retira(25));

        System.out.println("Saldo da conta 1 é " + conta1.getSaldo());
        System.out.println("Saldo da conta 2 é " + conta2.getSaldo());  

       }
   }
}
