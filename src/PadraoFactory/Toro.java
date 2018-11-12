
package PadraoFactory;


public class Toro implements Carro {
protected double valorCarro;
    @Override
    public void exibirInfo() {
        System.out.println("Modelo: Toro");
    }

    @Override
    public void valorCarro() {
        valorCarro = 135000;
        System.out.print("Valor: R$" + valorCarro);
    }
    
}
