
package classes;

public class Facil extends Conta{

    public Facil(Cliente cliente, String conta, float saldo) {
        super.setCliente(cliente);
        super.setConta(conta);
        super.setSaldo(saldo);
    }
    
}
