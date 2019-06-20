
package classes;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Banco {
    private List<Agencia> agencias;
    
    /*1*/
    
    /*2*/
    public boolean cadastrarAgencia(String nomeAgencia, String numeroAgencia, String pais, String cidade, String rua, String bairro,String cep,int numero){
        agencias = new  LinkedList<Agencia>();
        Agencia agencia = new Agencia(nomeAgencia,numeroAgencia,pais,cidade, rua,bairro,cep,numero);
        agencias.add(agencia);
        return true;
    }
    /*3*/
    public boolean abrirConta(String tipoConta, String cpf, String nome, String pais,  String cidade, String rua, String bairro, String cep, int numero, String dataNasc,  String tipoCliente, String agencia, double valor ){
        for(int i = 0 ; i < agencias.size() ; i++){ //procura a agencia que vai abrir a conta
            
        }
        return true;
    }
    
    /*4*/
    public float saque(String numeroAgencia, float valor){
        
      
      
    
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
    public String gerarExtratos(String numeroAgencia, String conta){
        return "";
    }
    /*8*/
    public String gerarRelatorios(){
        return "";
    }

    
    public String  gerarNumeroConta(String numeroAgencia){ //Método para gerar um numero da conta
       

        boolean temConta = false;//sinalizador para ver se tem ou nao tem conta
        String numeroConta=""; //numero da conta a ser retornada 
        
        int i =0;
       while(  i  < agencias.size()  ){  //Procura a agencia e verifica se tem conta nela.
            if(agencias.get(i).getNumeroAgencia().equals(numeroAgencia) && agencias.get(i).temConta()   ){  //é o numero da agencia?   tem conta?
                temConta = true;
            }
            i++;
        }
       
        if(!temConta){ //se  não tiver, o numero da conta é gerado de maneira aleatoria
            return gerarNumeros();
         }else{ //se estiver,  gera o numero e compara se é igual as outras, se for vai gerando até ser diferente
                          boolean podeCriar = false;
                          while(!podeCriar){ //enquanto  o numero criado for igual as outras nâo cria
                                    numeroConta = gerarNumeros();
                                    podeCriar = true;
                                    for(int j = 0 ; j <  agencias.get(i).getContas().size() ; j++){
                                          if(agencias.get(i).getContas().get(j).verificaConta(numeroConta)){ //Se existir um numero ele para de verificar cortando o laco
                                              podeCriar = false;
                                             break;
                                          }   
                                   }
                         }
                         return numeroConta;
        }
    }
    
    public String gerarNumeros(){
            String str="";
            Random gerador = new Random();
            for(int i=0 ; i < 5 ; i++){
                        str += gerador.nextInt(9);
            }
           return str;
    }
    
    /*Encapsulamentos*/
    public List<Agencia> getAgencias() {
        return agencias;
    }

    public void setAgencias(List<Agencia> agencias) {
        this.agencias = agencias;
    }

    @Override
    public String toString() {
        String str ="";
        for(int i = 0 ; i < agencias.size();i++){
             str +=  agencias.get(i).toString();
        }
        return str;
    }
    
    
    
    
   }
   