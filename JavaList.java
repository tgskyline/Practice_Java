import java.util.ArrayList;

public class JavaList {
  public static void main(String[] args) {
    ArrayList<String> materiais = new ArrayList<String>();

  materiais.add("Caderno");
  materiais.add("Livro");
  materiais.add("Caneta");

  materiais.set(1,"E-book");

  // .set usado para modificar um item na posiação informada
    
  System.out.println(materiais);
  System.out.println(materiais.size());

  materiais.remove(2);

    System.out.println(materiais);
    System.out.println(materiais.size());
  }
}
