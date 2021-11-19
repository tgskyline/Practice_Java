public class JavaAccountBank {
    private String nomeCorrentista;
    private double saldo;

    
    public JavaAccountBank (String n, double s) {
     nomeCorrentista = n;
     saldo = s;
    }

    public double getSaldo  () {return saldo;}

    public String getNome () { return nomeCorrentista;}

    public void deposita (double quantia) {saldo += quantia;}

    public double retira (double quantia) {
        if (quantia < saldo) {
            saldo -= quantia;
            return quantia;
        }    
    
        return -1;
    
    }
       
}
