
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
                   System.out.print("Nome da Agencia: ");
                   String nomeAgencia     = ler.nextLine();
                   System.out.print("Numero da  Agencia: ");
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
              
                   System.out.println(banco.getAgencias().get(0).toString());
                   break;
                   
               case 2:
                     System.out.print("Tipo da conta:  ");
                     String tipoConta =  ler.nextLine();
                      System.out.print("CPF:  ");
                     String cpf = ler.nextLine();
                     System.out.print("Nome:  ");
                     String nome =  ler.nextLine();
                     System.out.print("País:  ");
                     pais = ler.nextLine();
                     System.out.print("Cidade:  ");
                    cidade = ler.nextLine();
                     System.out.print("Rua:  ");
                     rua = ler.nextLine();
                     System.out.print("Bairro:  ");
                     bairro = ler.nextLine();
                     System.out.print("Cep:  ");
                     cep = ler.nextLine();
                     System.out.print("Numero:  ");
                     numero = ler.nextInt();
                     System.out.print("Data de Nascimento:  ");
                     String dataNasc = ler.nextLine();
                      System.out.print("Tipo do Cliente:  ");
                     String tipoCliente = ler.nextLine();
                      System.out.print("Numero da Agencia:  ");
                     String agencia = ler.nextLine();
                     System.out.print("Valor Inicial a ser Depositado:  ");
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
