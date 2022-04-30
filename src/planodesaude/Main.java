package planodesaude;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;// Organizar os nomes dentro do txt e verificar o visual do programa no cmd.

/**
 * @author (feito solo/sozinho)Pedro Evaristo, Alu202112084
 */
public class Main {

    public static void main(String[] args) {
        Cliente pass = new Cliente();
        System.out.println("Digite suas informações pessoais:");

        pass.Nome();
        pass.idade();
        pass.CEP();
       

        System.out.println("\nAqui estao as informações dos profissinais nas respectivas areas: ");
        
        try {
            BufferedReader out = new BufferedReader(new FileReader("Nomes.txt"));
            String s;
            while ((s = out.readLine()) != null) {
                System.out.println(s);
            }
            out.close();
        } catch (IOException e) {
            e.getStackTrace();
        }

        
        System.out.println("Quais das opcoes acima quer marca o horario?");
        String sc, s;
        File arq = new File("Nomes.txt");
        FileReader fil = null;
        Scanner write = new Scanner(System.in);

        s = write.nextLine();

        System.out.println("Certo, foi selecionado essa opcao: \n");
        try {
            fil = new FileReader(arq);
            BufferedReader get = new BufferedReader(fil);

            while ((sc = get.readLine()) != null){
                if (sc.contains(s)) {
                    System.out.print(sc);
                    pass.Agendaconsulta(sc);
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        Plano informacoes = new Plano();
        informacoes.opcoes(pass);
        
        informacoes.autoConsulta(pass.getConsulta());
        
    }
}
