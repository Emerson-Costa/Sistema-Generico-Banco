
package classes;

public class Extrato {
    
 private String transacoes;

     public Extrato() {
        transacoes  = "";  
     }

     public void transacao(double Transacao, String tipo){
        
         if(tipo.equals("Deposito")){
            this.transacoes += "DEPOSITO "+ Transacao+"\n";
        }
        
        if(tipo.equals("Saque")){
            this.transacoes +=  "SAQUE "+Transacao+"\n";
         }
          
        if(tipo.equals("Transferencia")){
            this.transacoes += "TRANSFERENCIA "+ Transacao+"\n";
        }
        
    }
    
    public String getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(String Transacoes) {
        this.transacoes = Transacoes;
    }
 
}
