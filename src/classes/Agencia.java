
package classes;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Agencia implements Comparable<Agencia> {
    
    private String   nomeAgencia; 
    private String   numeroAgencia;
    private Endereco endereco;
    private List<Conta> contas;

    public Agencia(String nomeAgencia, String numeroAgencia, String pais, String cidade, String rua, String bairro, String cep, int numero) {
        this.nomeAgencia = nomeAgencia;
        this.numeroAgencia = numeroAgencia;
        endereco = new Endereco(pais, cidade, rua, bairro, cep, numero);  
        contas = new LinkedList<Conta>();
    }
    
    public boolean abrirConta(String tipoConta, String cpf, String nome,String pais, String cidade,String rua, String bairro, String cep, int numero, String dataNasc, String tipoCliente, double valorInicial  ){
        Cliente cliente = new Cliente(cpf, nome, pais, cidade, rua, bairro, cep, numero, dataNasc, tipoCliente);
        Conta conta=null;
        if(tipoConta.equals("C") || tipoConta.equals("c")  )
              conta = new Corrente(gerarNumeroConta(), valorInicial,cliente);   
        else  if(tipoConta.equals("P") || tipoConta.equals("p")  )
                            conta = new Poupanca(gerarNumeroConta(), valorInicial,cliente);      
                      else    if(tipoConta.equals("F") || tipoConta.equals("f")  )
                                          conta = new Facil(gerarNumeroConta(), valorInicial,cliente);             
                
         contas.add(conta);
        return true;
    }
    
     public String gerarNumeroConta(){ //Criar uma lista onde guarda numeros de contas existentes para nao repetir
            String str="";
            Random gerador = new Random();
            for(int i=0 ; i < 5 ; i++){
                        str += gerador.nextInt(9);
            }
           return str;
    }

    public boolean temConta(){
       if(contas.size() == 0){
           return false;
       }  else{
           return true;
       }  
    }

    @Override
    public String toString() {
        return "   \nAgencia{" + "nomeAgencia=" + nomeAgencia + ", endereco=" + endereco + ", numeroAgencia=" + numeroAgencia + ", contas=" + contas + '}';
    }
   
    //Metodos de Ordenacao
    public void ordenaContasNumero(  ){
        
        Conta vet[] = new Conta[contas.size()];
        for(int i = 0 ; i  <  contas.size() ; i++ ){ //Copia de uma lista para um vetor
            vet[i] = contas.get(i);
        }
        
        for(int i = 0 ; i < vet.length ; i++){ //Ordena o vetor
            for(int j = i + 1 ; j < vet.length ; j++){
                  if(vet[i].getNumeroConta().compareToIgnoreCase(vet[j].getNumeroConta()) > 0) {
                       Object aux = vet[i];
                       vet[i] = vet[j];
                       vet[j] = (Conta) aux;
                  }
            }
        }
        
        for(int i = 0 ; i < vet.length ; i++){ //remove os elementos desordenados
            contas.remove(i);
        }
        
        for(int i = 0 ; i < vet.length ; i++){ //adiciona os elementos ordenados na lista
            contas.add(vet[i]);
        }
           
    }
    
    
    //encapsulamento
   
    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String NumeroAgencia) {
        this.numeroAgencia = NumeroAgencia;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }   

    @Override
    public int compareTo(Agencia outraAgencia) {
        if(this.numeroAgencia.compareToIgnoreCase(nomeAgencia) > 0){
             return 1;
        }
        
        if(this.numeroAgencia.compareToIgnoreCase(nomeAgencia) < 0){
            return -1;
        }
        return 0;
    }

}
