
package classes;

import java.util.LinkedList;
import java.util.List;

public class Agencia {
    private String   nomeAgencia; 
    private Endereco endereco;
    private String   numeroAgencia; 
    private List<Conta> contas;
    private List<Cliente> clientes;

    public Agencia(String nomeAgencia, String numeroAgencia, String pais, String cidade, String rua, String bairro, String cep, int numero) {
        this.nomeAgencia = nomeAgencia;
        this.numeroAgencia = numeroAgencia;
        endereco = new Endereco(pais, cidade, rua, bairro, cep, numero);  
        contas = new LinkedList<Conta>();
        clientes = new LinkedList<Cliente>();
    }
    
    public boolean abrirConta(String tipoConta, String cpf, String nome,String pais, String cidade,String rua, String bairro, String cep, int numero, String dataNasc, String tipoCliente, String numAgencia, double valorInicial  ){
        Cliente cliente = new Cliente(cpf, nome, pais, cidade, rua, bairro, cep, numero, dataNasc, tipoCliente);
        Conta conta=null;
        if(tipoConta.equals("C") || tipoConta.equals("c")  )
              conta = new Corrente(numAgencia, valorInicial);   
        else  if(tipoConta.equals("P") || tipoConta.equals("p")  )
                            conta = new Poupanca(numAgencia, valorInicial);      
                      else    if(tipoConta.equals("F") || tipoConta.equals("f")  )
                                          conta = new Facil(numAgencia, valorInicial);             
                
         clientes.add(cliente);
         contas.add(conta);
        return true;
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
        return "\nnomeAgencia: "+ nomeAgencia + "\nendereco: " + endereco + "\nnumeroAgencia: " + numeroAgencia + "\ncontas: " + contas + "\nclientes: " + clientes+"\n\n";
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

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
