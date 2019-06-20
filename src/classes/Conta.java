
package classes;

public class Conta {
    
    private String conta;
    private double saldo;

    public Conta(String conta, double saldo) {
        this.conta = conta;
        this.saldo = saldo;
    }

    public boolean verificaConta(String conta ){
        if(this.conta.equals(conta)){
            return true;
        }else{
            return false;
        }
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "conta: " + conta + "\n saldo: " + saldo + '\n';
    }
    
}
