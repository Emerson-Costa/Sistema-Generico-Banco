
package classes;

public class Corrente extends Conta{

    public Corrente(String numeroConta, double saldo, Cliente cliente) {
        super(numeroConta, saldo, cliente);
    }

   public float taxa(){
       return 0;
   } 
}
