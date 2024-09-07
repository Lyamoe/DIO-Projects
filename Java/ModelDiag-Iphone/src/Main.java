import celular.Iphone;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Iphone iphone = new Iphone();
        
        //? testando funções
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
    }
}