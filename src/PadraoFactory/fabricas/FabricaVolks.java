
package PadraoFactory.fabricas;

import PadraoFactory.Carro;
import PadraoFactory.Amarok;

public class FabricaVolks implements FabricaDeCarro {

    @Override
    public Carro criarCarro() {
       return new Amarok();
       
    }
    
}
