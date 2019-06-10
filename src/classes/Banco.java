
package classes;
import java.util.List;

public class Banco {
    public List<Agencia> agencias;
    
    /*1*/
    
    /*2*/
    public boolean cadastrarAgencia(String nomeAgencia,String numeroAgencia,String pais,
    String cidade,String enderecoAgencia, String bairro,String cep,int numero           ){
        
        Agencia agencia = new Agencia(nomeAgencia,numeroAgencia,pais,cidade,
        enderecoAgencia,bairro,cep,numero);
        
        agencias.add(agencia);
        return true;
    }
    /*3*/
    public boolean abrirConta(String tipoConta,String cpf,String nome,String pais,
    String cidade,String rua,String bairro,String cep,int numero,Data dataNasc, 
    String tipoCliente,String agencia, float valor                                      ){
        
        Cliente cliente = new Cliente(cpf,nome,pais,cidade,rua,bairro,cep,numero,
        dataNasc,tipoCliente);
        
        Conta conta=null;
        if(tipoConta.equals("C") || tipoConta.equals("c")){
           conta = new Corrente(cliente, agencia, valor);
        }else{
           if(tipoConta.equals("P") || tipoConta.equals("p")){
             conta = new Poupanca(cliente, agencia, valor);
           }else{
              if(tipoConta.equals("F") || tipoConta.equals("f")){
                conta = new Corrente(cliente, agencia, valor);
              }
           }
          
           return true;
        }
        return false;
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
    
   }
   
   
   

