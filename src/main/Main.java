
package main;

import classes.Agencia;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {  
        Agencia agencia;
        Boolean contaAberta = false;
        Scanner ler = new Scanner(System.in);
        
        int op = 0;
        while(op != 10){
           System.out.print("Informe a Opcao: ");
           op  = ler.nextInt(); ler.nextLine();
           switch(op){
               case 1:
                   System.out.print("Nome Agencia: ");
                   String nomeAgencia     = ler.nextLine();
                   System.out.print("Numero Agencia: ");
                   String numeroAgencia   = ler.nextLine();
                   System.out.print("País: ");
                   String pais            = ler.nextLine();
                   System.out.print("Cidade: ");
                   String cidade          = ler.nextLine();
                   System.out.print("Endereco: ");
                   String enderecoAgencia = ler.nextLine();
                   System.out.print("Bairro: ");
                   String bairro          = ler.nextLine();
                   System.out.print("CEP: ");
                   String cep             = ler.nextLine();
                   System.out.print("Numero: ");
                   int  numero            = ler.nextInt(); 
                   
                   agencia                = new Agencia(nomeAgencia,numeroAgencia,pais,cidade,enderecoAgencia,bairro,cep,numero);
                   
                   contaAberta = true;
                   System.out.println(agencia.toString());
                   break;
                   
               case 2:
    
                   if(contaAberta){
                     
                     
                   }else{
                       System.out.println("Nenhuma conta ou agência foi aberta!");
                   }
                   break;
               case 3:
                   if(contaAberta){
                       
                   }else{
                       System.out.println("Nenhuma conta ou agência foi aberta!");
                   }
                   break;
               case 4:
                   if(contaAberta){
                       
                   }else{
                       System.out.println("Nenhuma conta ou agência foi aberta!");
                   }
                   break;
               case 5:
                   if(contaAberta){
                       
                   }else{
                       System.out.println("Nenhuma conta ou agência foi aberta!");
                   }
                   break;
               case 6:
                   if(contaAberta){
                       
                   }else{
                       System.out.println("Nenhuma conta ou agência foi aberta!");
                   }
                   break;
               case 7:
                   if(contaAberta){
                       
                   }else{
                       System.out.println("Nenhuma conta ou agência foi aberta!");
                   }
                   break;
               case 8:
                   if(contaAberta){
                       
                   }else{
                       System.out.println("Nenhuma conta ou agência foi aberta!");
                   }
                   break;
               case 9:
                   if(contaAberta){
                       
                   }else{
                       System.out.println("Nenhuma conta ou agência foi aberta!");
                   }
                   break;
               default:
                   if(op != 0 && op != 10){
                        System.out.println("Entrada inválida");
                   }
                   break;    
           }
        }
    }
    
}
