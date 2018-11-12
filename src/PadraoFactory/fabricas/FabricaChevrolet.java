
package PadraoFactory.fabricas;

import PadraoFactory.Carro;
import PadraoFactory.S_10;

public class FabricaChevrolet implements FabricaDeCarro {
    
    @Override
    public Carro criarCarro() {
       return new S_10();
       
    }
    
}
