
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
           op  = ler.nextInt(); ler.nextLine();
           switch(op){
               case 1:
                   String nomeAgencia     = ler.nextLine();
                   String numeroAgencia   = ler.nextLine();
                   String pais            = ler.nextLine();
                   String cidade          = ler.nextLine();
                   String enderecoAgencia = ler.nextLine();
                   String bairro          = ler.nextLine();
                   String cep             = ler.nextLine();
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
