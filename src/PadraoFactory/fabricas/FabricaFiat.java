
package PadraoFactory.fabricas;

import PadraoFactory.Carro;
import PadraoFactory.Toro;
import PadraoFactory.fabricas.FabricaDeCarro;

public class FabricaFiat implements FabricaDeCarro {

    @Override
    public Carro criarCarro() {
       return new Toro();
       
    }
    
}
