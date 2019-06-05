
package classes;

public class Extratos {
  private float conta; 
  private float deposito;
  private float saque;
  private float transferencia;
  private float emprestimo;
  private float saldoAtual;
  private float saldoDevedor;

    public Extratos(float conta) {
        this.conta = conta;
    }

    public float getDeposito() {
        return deposito;
    }

    public void setDeposito(float deposito) {
        this.deposito += deposito;
    }

    public float getSaque() {
        return saque;
    }

    public void setSaque(float saque) {
        this.saque -= saque;
    }

    public float getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(float transferencia) {
        this.transferencia -= transferencia;
    }

    public float getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(float emprestimo) {
        this.emprestimo += emprestimo;
    }

    public float getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(float saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public float getSaldoDevedor() {
        return saldoDevedor;
    }

    public void setSaldoDevedor(float saldoDevedor) {
        this.saldoDevedor = saldoDevedor;
    }

    @Override
    public String toString() {
        return "Extratos{" + "conta=" + conta + ", deposito=" + deposito + ", saque=" + saque + ", transferencia=" + transferencia + ", emprestimo=" + emprestimo + ", saldoAtual=" + saldoAtual + ", saldoDevedor=" + saldoDevedor + '}';
    }
  
    
}
