
package classes;

public class Conta {
    Cliente cliente;
    private String numeroConta;
    private double saldo;
    Extrato extrato; //Capaz de guardar os extratos da conta
  
    public Conta(String numeroConta, double saldo, Cliente cliente) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        extrato = new Extrato( );
        extrato.transacao(saldo, "Deposito");
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

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setnumeroConta(String conta) {
        this.numeroConta = conta;
    }

    @Override
    public String toString() {
        return "Conta{" + "cliente=" + cliente + ", numeroConta=" + numeroConta + ", saldo=" + saldo + ", extrato=" + extrato + '}';
    }

    
    
}
