
package classes;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Agencia  {
    
    private String   nomeAgencia; 
    private String   numeroAgencia;
    private Endereco endereco;
    private List<Conta> contas;
    private int numero; //vai ajudar na geração de numeros das contas
    
    public Agencia(String nomeAgencia, String numeroAgencia, String pais, String cidade, String rua, String bairro, String cep, int numero) {
        this.nomeAgencia = nomeAgencia;
        this.numeroAgencia = numeroAgencia;
        endereco = new Endereco(pais, cidade, rua, bairro, cep, numero);  
        contas = new LinkedList<Conta>();
        numero = 0;
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
          
         numero ++;//incrementa o numero
          int  cont = numero;
           int quantidadeDigito=0;
           
           while(cont != 0){//contar os digitos do numero
 
             quantidadeDigito++;
               cont = cont/10;
               
           }
           
           String str;
           if(quantidadeDigito == 1){ // Concatena 4 zero a esquerda se o numero for de 1 digito 
                  str = "0000"+numero;
                 return str;
           }
           
           if(quantidadeDigito == 2){// Concatena 3 zero a esquerda se o numero for de 2digito 
                 str = "000"+numero;
                 return str;
           }
           
           if(quantidadeDigito == 3){// Concatena 2 zero a esquerda se o numero for de 3 digito 
                 str = "00"+numero;
                 return str;
           }
           
           if(quantidadeDigito == 4){// Concatena 1 zero a esquerda se o numero for de 4 digito 
                  str = "0"+numero;
                 return str;
           }
         
           return str = ""+numero;//retorna se o numero conter 5 dígito
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
   
   public void ordenaContasNumero(  ){
        
        Conta vet[] = new Conta[contas.size()]; //Cria um vetor de agencias
        
        for(int i = 0 ; i  <  contas.size() ; i++ ){ //Copia de uma lista para um vetor de agencias
            vet[i] = contas.get(i);
        }
        
       for(int i = 0 ; i < vet.length ; i++){ //Ordena o vetor
            for(int j = i + 1 ; j < vet.length ; j++){
                  if(vet[i].getNumeroConta().compareToIgnoreCase(vet[j].getNumeroConta()) > 0) {
                       Conta aux = vet[i];
                       vet[i] = vet[j];
                       vet[j] =  aux;
                  }
            }
        }
        
       contas.removeAll(contas);//Remove todas as informacoes desordenadas da lista
       
        
        for(int i = 0; i < vet.length ; i++){ //adiciona os elementos ordenados na lista
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

}
