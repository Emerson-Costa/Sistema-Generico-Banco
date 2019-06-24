
package classes;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Banco{
    
    private List<Agencia> agencias;
    private int quantidadeContas;

    public Banco() {
        this.agencias  = new  LinkedList<Agencia>();
        this.quantidadeContas = 0;
    }
    
    /*1 - Virada do Mês*/
    public void viradaMes(){ //Método para o desconto das taxas
        
    }
    /*2 - Cadastrar Agência*/
    public boolean cadastrarAgencia(String nomeAgencia, String numeroAgencia, String pais, String cidade, String rua, String bairro,String cep,int numero){
        Agencia agencia = new Agencia(nomeAgencia,numeroAgencia,pais,cidade, rua,bairro,cep,numero);
        agencias.add(agencia);
        return true;
    }
    /*3 - Abertura de Conta*/
    public boolean abrirConta(String tipoConta, String cpf, String nome, String pais,  String cidade, String rua, String bairro, String cep, int numero, String dataNasc,  String tipoCliente, String agencia, double valorInicial ){
        for(int i = 0 ; i < agencias.size() ; i++){ //procura a agencia que vai abrir a conta
             if(agencias.get(i).getNumeroAgencia().equals(agencia)){
                   agencias.get(i).abrirConta(tipoConta, cpf, nome, pais, cidade, rua, bairro, cep, numero, dataNasc, tipoCliente, valorInicial); 
                   System.out.print("O numero da sua conta é: "+agencias.get(i).getContas().get(quantidadeContas).getNumeroConta()+"\n\n");
                   this.quantidadeContas++;
             }
        }
        
        return true;
    }
    
    /*4 - Saque*/
    public float saque(String agencia, String numeroConta,  double  valor){
        
      for(int i = 0 ; i < agencias.size() ; i++){ //procura a agencia que vai sacare o valor  da conta
             if(agencias.get(i).getNumeroAgencia().equals(agencia)){
                  int j = 0;
                  while(j < agencias.get(i).getContas().size()){
                           if(agencias.get(i).getContas().get(j).verificaConta(numeroConta)){
                               agencias.get(i).getContas().get(j).sacarDinheiro(valor);
                               agencias.get(i).getContas().get(j).extrato.transacao(valor, "Saque");
                               break;
                           }
                  }
             }
        }
     
        return 0;
    }
    /*5 - Depósito em Conta*/
    public boolean depositar(String agencia, String numeroConta,  double valor){
        
         for(int i = 0 ; i < agencias.size() ; i++){ //procura a agencia que vai sacare o valor  da conta
             if(agencias.get(i).getNumeroAgencia().equals(agencia)){
                  int j = 0;
                  while(j < agencias.get(j).getContas().size()){
                           if(agencias.get(i).getContas().get(j).verificaConta(numeroConta)){
                                agencias.get(i).getContas().get(j).depositarDinheiro(valor);
                                agencias.get(i).getContas().get(j).extrato.transacao(valor, "Deposito");
                               break;
                           }
                  }
             }
        }
   
        return true;
        
    }
    /*6 - Transferência*/
    public boolean transferencia(String agenciaOrigem, String contaOrigem, String agenciaDestino, String contaDestino, double valor){
        
            for(int i = 0 ; i < agencias.size() ; i++){ //procura a agencia  e a conta de Origem que vai transferir o valor
                if(agencias.get(i).getNumeroAgencia().equals(agenciaOrigem)){
                     int j = 0;
                     while(j < agencias.get(j).getContas().size()){
                              if(agencias.get(i).getContas().get(j).verificaConta(contaOrigem)){
                                   agencias.get(i).getContas().get(j).sacarDinheiro(valor);
                                   agencias.get(i).getContas().get(j).extrato.transacao(valor,"Transferencia");
                               }
                     }
                }
            } 
           
            for(int i = 0 ; i < agencias.size() ; i++){ //procura a agencia  e a conta Destino que vai Receber o valor Transferido
               if(agencias.get(i).getNumeroAgencia().equals(agenciaOrigem)){
                    int j = 0;
                    while(j < agencias.get(j).getContas().size()){
                             if(agencias.get(i).getContas().get(j).verificaConta(contaOrigem)){
                                 agencias.get(i).getContas().get(j).depositarDinheiro(valor);
                             }
                    }
               }
           } 
           return true;
           
    }
    
    /*7 - Gerar Extratos*/
    public String gerarExtratos(String numeroAgencia, String conta){
         for(int i = 0 ; i < agencias.size() ; i++){ //procura a agencia  e a conta Destino que vai gerar o extrato
               if(agencias.get(i).getNumeroAgencia().equals(numeroAgencia)){
                    int j = 0;
                    while(j < agencias.get(j).getContas().size()){
                             if(agencias.get(i).getContas().get(j).verificaConta(conta)){
                                 return  agencias.get(i).getContas().get(j).extrato.getTransacoes();
                             }
                    }
               }
           } 
           return "Não há transacoes";
    }
    
    /*8 - Gerar Relatórios*/
    public void gerarRelatorios(/*String agencia , String conta, String cpf*/){
       ordenaAgenciasNumero();
        System.out.println(agencias);
       
    }

  
     public void ordenaAgenciasNumero(  ){
        
        Agencia vet[] = new Agencia[agencias.size()]; //Cria um vetor de agencias
        
        for(int i = 0 ; i  <  agencias.size() - 1 ; i++ ){ //Copia de uma lista para um vetor de agencias
            vet[i] = agencias.get(i);
        }
        
       for(int i = 0 ; i < vet.length - 1 ; i++){ //Ordena o vetor
            for(int j = i + 1 ; j < vet.length  - 1; j++){
                  if(vet[i].getNumeroAgencia().compareToIgnoreCase(vet[j].getNumeroAgencia()) > 0) {
                       Object aux = vet[i];
                       vet[i] = vet[j];
                       vet[j] = (Agencia) aux;
                  }
            }
        }
        
        int TAM =  vet.length;
        for(int i = 0 ; i < TAM - 1 ; i++){ //remove os elementos desordenados da lista
            agencias.remove(i);
        }
        
        for(int i = 0; i < TAM - 1; i++){ //adiciona os elementos ordenados na lista
            agencias.add(vet[i]);
        }
           
    }
    
    /*Encapsulamentos*/
    public List<Agencia> getAgencias() {
        return agencias;
    }

    public void setAgencias(List<Agencia> agencias) {
        this.agencias = agencias;
    }

    public int getQuantidadeContas() {
        return quantidadeContas;
    }

    public void setQuantidadeContas(int quantidadeContas) {
        this.quantidadeContas = quantidadeContas;
    }

   }
   