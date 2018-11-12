package PadraoFactory;

import PadraoFactory.fabricas.FabricaChevrolet;
import PadraoFactory.fabricas.FabricaFiat;

public class PadraoFactory {
    public static void main(String[] args) {
      
       menuCompraCarro menuCarro = new menuCompraCarro();
       
       menuCarro.MenuPrincipal();
    }
    
}
