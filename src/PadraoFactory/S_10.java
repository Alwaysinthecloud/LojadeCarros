package PadraoFactory;
public class S_10 implements Carro {
protected double valorCarro;
    @Override
    public void exibirInfo() {
        System.out.println("Modelo: S-10 ");
    }

    @Override
    public void valorCarro() {
        valorCarro = 180000;
        System.out.println("Valor: R$" + valorCarro);
    }
    
}
