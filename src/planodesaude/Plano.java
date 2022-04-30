package planodesaude;
import java.io.*;
import java.util.*;

public class Plano {
       private int opcoes;//fazer o switch para saber se 

    private Plano(int opcoes){
        this.opcoes = opcoes;
    }

    public void autoConsulta(String consulta){//autorizar
        System.out.println("\n\nFoi autorizado com sucesso. Tenha um otimo dia.");
    }
    
    Plano() {
    }
       
       
    private int getOpcoes() {
        return opcoes;
    }

    private void setOpcoes(int opcoes) {
        this.opcoes = opcoes;
    }

    public void opcoes(Cliente pass){
        System.out.println("\n\nQuais das opcoes voce quer usar? ");
        System.out.println("1-  individual | 2 - Familiar");
        Scanner quant = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        
        int value = input.nextInt();
        switch(value){
            
            case 1 -> {
                System.out.println("O valor mensal sera 200 reais no plano individual");
                pass.tipoPlano("Individual");
               }
            case 2 -> {
                System.out.println("Quantas pessoas voce prentende colocar no plano de saude? ");
                int person = quant.nextInt();
                int total = (300*person);
                System.out.println("O valor sera: " + total + " no plano familiar");
                pass.tipoPlano("Familiar");
               }
            
        }
    }
}
