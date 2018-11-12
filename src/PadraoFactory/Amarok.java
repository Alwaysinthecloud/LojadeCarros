package PadraoFactory;

public class Amarok implements Carro {
protected double valorCarro;
    public Amarok() {
    }

    @Override
    public void exibirInfo() {
        System.out.println("Modelo: Amarok ");
    }

    @Override
    public void valorCarro() {
        valorCarro = 187000;
        System.out.print("Valor: R$" + valorCarro);
}
}
