
package main;

import classes.Banco;
import java.util.Random;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {  
        
        Scanner ler = new Scanner(System.in);
        Banco   banco = new Banco();
       
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
                   System.out.print("Rua: ");
                   String rua = ler.nextLine();
                   System.out.print("Bairro: ");
                   String bairro          = ler.nextLine();
                   System.out.print("CEP: ");
                   String cep             = ler.nextLine();
                   System.out.print("Numero: ");
                   int  numero            = ler.nextInt(); 
                     
                   banco.cadastrarAgencia(nomeAgencia, numeroAgencia, pais, cidade, rua, bairro, cep, numero);
              
                   break;
                   
               case 2:
                     String tipoConta =  ler.nextLine();
                     String cpf = ler.nextLine();
                     String nome =  ler.nextLine();
                     pais = ler.nextLine();
                    cidade = ler.nextLine();
                     rua = ler.nextLine();
                     bairro = ler.nextLine();
                     cep = ler.nextLine();
                     numero = ler.nextInt();
                     String dataNasc = ler.nextLine();
                     String tipoCliente = ler.nextLine();
                     String agencia = ler.nextLine();
                     double depositoInicial = ler.nextDouble();
                     
                     banco.abrirConta(tipoConta, cpf, nome, pais, cidade, rua, bairro, cep, numero, dataNasc, tipoCliente, agencia, depositoInicial);
                   break;
               case 3:
                   
                   break;
               case 4:
                   
                   break;
               case 5:
                   
                   break;
               case 6:
                  
                   break;
               case 7:
                 
                   break;
               case 8:
                 
                   break;
               case 9:
                   
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
