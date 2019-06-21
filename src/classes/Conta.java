
package classes;

public class Conta {
    
    private String numeroConta;
    private double saldo;
    
    public Conta(String conta, double saldo) {
        this.numeroConta = conta;
        this.saldo = saldo;
    }

    public boolean verificaConta(String conta ){
        if(this.numeroConta.equals(conta)){
            return true;
        }else{
            return false;
        }
    }
    
    public void depositarDinheiro(double valor){
         saldo += valor;
    }
    
    public double sacarDinheiro(double valor){
        if(valor >= saldo){
            saldo -= valor;
            return valor;
        }else{
            return 0;
        }
    }
    
    //encapsulamento
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getConta() {
        return numeroConta;
    }

    public void setConta(String conta) {
        this.numeroConta = conta;
    }

    @Override
    public String toString() {
        return "conta: " + numeroConta + "\n saldo: " + saldo + '\n';
    }
    
}
