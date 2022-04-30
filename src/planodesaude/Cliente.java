package planodesaude;

import java.util.Scanner;

public class Cliente {

    private String nome;
    private int idade;
    private String CEP;
    private String consulta;
    private String tipoPlano;

    int total = 0;

    public Cliente(String nome, int idade, String CEP, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.CEP = CEP;
    }   
    
    public String getTipoPlano() {
        return tipoPlano;
    }

    public void setTipoPlano(String tipoPlano) {
        this.tipoPlano = tipoPlano;
    }
    
    
   

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }
    
    Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCEP(){
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

   
//------------------
    public void tipoPlano(String tipoPlano){
        this.setTipoPlano(tipoPlano);
    }
    
    
    public void Agendaconsulta(String consulta){
      this.setConsulta(consulta);
        System.out.println("\n\nFoi agendado");
    }
    
    public void Nome() {
        System.out.println("Nome: ");
        Scanner scan = new Scanner(System.in);
        String nome = scan.nextLine();
        this.setNome(nome);
    }

    public void idade() {
        System.out.println("Idade: ");
        Scanner scan = new Scanner(System.in);
        int idade = scan.nextInt();
        this.setIdade(idade);
    }

    public void CEP() {
        Scanner scan = new Scanner(System.in);
        String cep;
        System.out.println("CEP");
        cep = scan.nextLine();
        int o = 0;
        while (o == 0) {            
            if (cep.length() != 8) {
                
                System.out.println("Digite novamente");
                
                cep = scan.nextLine();
            }else{
                o=1;
            }
        }
        this.setCEP(cep);
    }
}
