
package classes;

public class Cliente {
    private String nome;
    private String endereco;
    private Data dataNasc;
    private String cpf;
    private String tipoCliente;

    public Cliente(String nome, String endereco, Data dataNasc, String cpf, String tipoCliente) {
        this.nome = nome;
        this.endereco = endereco;
        this.dataNasc = dataNasc;
        this.cpf = cpf;
        this.tipoCliente = tipoCliente;
    }
    
    public boolean consultarCPF(String cpf){
        if(this.cpf.equals(cpf)){
            return true;
        }else{
            return false;
        }
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Data getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Data dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", endereco=" + endereco + ", dataNasc=" + dataNasc + ", cpf=" + cpf + ", tipoCliente=" + tipoCliente + '}';
    }
    
    
}
