
package PadraoFactory;

import java.util.Scanner;
import projetostrategycarro.MenuStrategy;

public class menuCompraCarro {
   
    MenuStrategy menuStrategy = new MenuStrategy();
    Scanner ent = new Scanner(System.in);
    private int opcao;
    private boolean continuar = true, continuar1 = true;
    
    public void MenuPrincipal() {
        do {
            System.out.println("\n-----------------------------------------------------------");
            System.out.println("---------------------------Bem-Vindo-----------------------");
            System.out.println("-----------Diversas ofertas de carros pra você-------------\n");
            System.out.println("1  --  Escolher Veículo");
            System.out.println("2  --  Sua escolha!");
            System.out.println("9  --  Finalizar aplicativo! ");
            System.out.print("Opção escolhida:");
            opcao = ent.nextInt();
            switch(this.opcao){
            case 1:
                this.MenuCarros();
                continuar = false;
                break;
            case 2:
                
                
                break;
            case 9:
                System.out.println("Aplicativo finalizado!");
                continuar = false;
                break; 
            default:
                System.out.println("Opção invalida! ");
                break;
        }
    }while(continuar);
    }

    public void MenuCarros() {

        do {
            System.out.println("\n-----------------------------------------------------------");
            System.out.println("---------------------Escolha o seu veículo-----------------\n");
            System.out.println("1  --  VOLKSWAGEN Amarok a partir de: R$187.000,00");
            System.out.println("2  --  FIAT Toro a partir de: R$135.000,00");
            System.out.println("3  --  CHEVROLET S-10 a partir de: R$180.000,00");
            System.out.println("9  --  Voltar ao Menu Principal! ");
            System.out.print("Opção escolhida:");
            opcao = ent.nextInt();
            switch(this.opcao){
            case 1:
                Amarok amarok = new Amarok();
                amarok.exibirInfo();
                amarok.valorCarro();
                this.menuStrategy.MenuOpcionais();
                continuar1 = false;
                break;
            case 2:
                Toro toro = new Toro();
                toro.exibirInfo();
                toro.valorCarro();
                this.menuStrategy.MenuOpcionais();
                continuar1 = false;
                break;
            case 3:
                S_10 s_10 = new S_10();
                this.menuStrategy.MenuOpcionais();
                continuar1 = false;
                break;
            case 9:
                this.MenuPrincipal();
                continuar1 = false;
                break; 
            default:
                System.out.println("Opção invalida! ");
                break;
        }
    }while(continuar1);
}
}