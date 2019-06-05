
package classes;

public class Corrente extends Conta{

    public Corrente(Cliente cliente, String conta, float saldo) {
        super(cliente, conta, saldo);
    }
 
   public float taxa(){
       return 0;
   } 
}
