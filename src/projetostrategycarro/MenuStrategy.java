package projetostrategycarro;

import PadraoFactory.menuCompraCarro;
import java.util.Scanner;

public class MenuStrategy {

    Scanner ent = new Scanner(System.in);
    private int opcao;
    private boolean continuar2 = true;

    public void MenuOpcionais() {

        do {
            System.out.println("\n------------------------------------------------------------");
            System.out.println("--------Deseja escolher opcionais para o seu veículo--------\n");
            System.out.println("1  --  Protetor de carter R$180,00");
            System.out.println("2  --  Farois em LED R$1.680,00");
            System.out.println("3  --  Kit multimídia R$1.450,00");
            System.out.println("5  --  Sem opcionais ");
            System.out.println("9  --  Menu Principal ");
            System.out.print("Opcionais escolhidos: ");
            opcao = ent.nextInt();
            switch(this.opcao){
            case 1:
               
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 5:
                
                break;
            case 9:
                menuCompraCarro menuCarro = new menuCompraCarro();
                menuCarro.MenuPrincipal();
                continuar2 = false;
                break; 
            default:
                System.out.println("Opção invalida! ");
                break;
        }
        } while (continuar2);
    }
}
