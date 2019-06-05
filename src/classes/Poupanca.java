
package classes;

public class Poupanca extends Conta{

    public Poupanca(Cliente cliente, String conta, float saldo) {
        super.setCliente(cliente);
        super.setConta(conta);
        super.setSaldo(saldo);
    }
    
}
