public class JavaClass {
    private String modelo;
    private double preco;
    private int velocidade;

    public void Acelerar(int kmph){
        velocidade =velocidade + kmph;
    }

    public void frear (){
        if (velocidade>0)
            velocidade = velocidade -1;
    }
    
    public int consultarVelocidade () {
        return velocidade;
    }
}
