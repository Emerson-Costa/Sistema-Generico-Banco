
package classes;

public class Corrente extends Conta{

    public Corrente(Cliente cliente, String conta, float saldo ) {
        super.setCliente(cliente);
        super.setConta(conta);
        super.setSaldo(saldo);
    }
      
   public float taxa(){
       return 0;
   } 
}
