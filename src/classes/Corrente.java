
package classes;

public class Corrente extends Conta{

    public Corrente(String conta, double saldo) {
        super(conta, saldo);
    }

   public float taxa(){
       return 0;
   } 
}
