
package classes;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private String   nomeAgencia; 
    private Endereco endereco;
    private String   numeroAgencia; 
    private Conta    conta;
    private Cliente  cliente;

    public Agencia(String nomeAgencia, Endereco endereco, String numeroAgencia, Conta conta, Cliente cliente) {
        this.nomeAgencia = nomeAgencia;
        this.endereco = endereco;
        this.numeroAgencia = numeroAgencia;
        this.conta = conta;
        this.cliente = cliente;
    }
    
    /*2*/
    public Agencia(String nomeAgencia, String numeroAgencia, String pais, String cidade, String enderecoAgencia, String bairro, String cep, int numero) {
        this.nomeAgencia = nomeAgencia;
        this.numeroAgencia = numeroAgencia;
        endereco = new Endereco(pais, cidade, enderecoAgencia, bairro, cep, numero);  
    }
   
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

    @Override
    public String toString() {
        return "Agencia{" + "nomeAgencia=" + nomeAgencia + ", endereco=" + endereco + ", numeroAgencia=" + numeroAgencia + ", conta=" + conta + ", cliente=" + cliente + '}';
    }

   
    
    
   

    
    
}
