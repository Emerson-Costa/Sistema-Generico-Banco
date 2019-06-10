
package classes;

import java.util.ArrayList;

public class Agencia {
    
  public ArrayList<Conta>  contas;
  public ArrayList<Cliente> clientes;
  
  private Endereco endereco;
  private String nomeAgencia;
  private String numeroAgencia; 
    /*2*/
    public Agencia(String nomeAgencia, String numeroAgencia, String pais, String cidade, String enderecoAgencia, String bairro, String cep, int numero) {
        this.nomeAgencia = nomeAgencia;
        this.numeroAgencia = numeroAgencia;
        endereco = new Endereco(pais, cidade, enderecoAgencia, bairro, cep, numero);  
    }
    /*3*/
    public boolean abrirConta(String tipoConta, String cpf, String nomeCliente, String rua, String cep ,String numero, String dataNasc, String tipoCliente, String agencia, float valor){
        return true;
    }
    /*4*/
    public float saque(String numeroAgencia, String conta){
        return 0;
    }
    /*5*/
    public boolean depositar(String numeroAgencia, float valor){
        return true;
    }
    /*6*/
    public boolean transferencia(String agenciaOrigem, String contaOrigem, String agenciaDestino, String contaDestino ){
        return true;
    }
    /*7*/
    public boolean solicitaEmprestimo(String numeroAgencia, String conta, float valor){
        return true;
    }
    /*8*/
    public String gerarExtratos(String numeroAgencia, String conta){
        return "";
    }
    /*9*/
    public String gerarRelatorios(){
        return "";
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
