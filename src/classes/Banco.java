
package classes;

import java.util.ArrayList;

public class Banco {
   
   public ArrayList<Conta>  contas;
   public ArrayList<Cliente> clientes;
   
       /*1*/
       public void viradaMes(){
           
       }     
      /*2*/
       public boolean cadastrarAgencia(String endereco, String bairro, String cep, String numero){
           return true;
       }
     /*3*/
       public boolean abrirConta(String nome, String endereco, Data dataNasc, String tipoCliente, Agencia agencia, float valorInicial){
           return true; 
       }
    /*4*/
       public void Saque(Agencia angencia, Conta conta, float valor){
          
       }
    /*5*/
       public void emprestimo(Agencia agencia, Conta conta, float valor){
           
       }
    /*6*/
       public void gerarExtratos(Agencia agencia, Conta conta){
           
       }
    /*9*/
       public void gerarRelatorios( ){
           
       }
   }
   
   
   

