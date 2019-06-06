
package classes;

import java.util.ArrayList;

public class Agencia {
    
  public ArrayList<Conta>  contas;
  public ArrayList<Cliente> clientes;
  
  private Endereco endereco;
  private String nomeAgencia;
  private String numeroAgencia; 

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
        return "Agencia{" + "endereco=" + endereco + ", nomeAgencia=" + nomeAgencia + ", numeroAgencia=" + numeroAgencia + '}';
    }
    
   

    
    
}
