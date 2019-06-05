
package classes;

public class Conta extends Agencia{
   private Cliente cliente;
   private String conta;
   private float saldo;

    public Conta(Cliente cliente, String conta, float saldo) {
        this.cliente = cliente;
        this.conta = conta;
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
   
    public void depositar(){
       
    }
   
    public float sacar(){
       return 0;
    }
   
    public float transferir(){
       return 0;
    }
   
    public void emprestimo(String Agencia, Conta Conta){
       
    }
    
    public boolean consultar(String conta){
        if(this.conta.equals(conta)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Conta{" + "cliente=" + cliente + ", conta=" + conta + ", saldo=" + saldo + '}';
    }
   
   
   
}
