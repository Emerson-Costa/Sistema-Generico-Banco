
package classes;

public class Endereco {
    private String pais;
    private String cidade;
    private String rua;
    private String bairro;
    private String cep;
    private int numero;

    public Endereco(String pais, String cidade, String rua, String bairro, String cep, int numero) {
        this.pais = pais;
        this.cidade = cidade;
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
        this.numero = numero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String endereco) {
        this.rua = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "               Endereco{" + "\n               pais: " + pais + "\n               cidade: " + cidade + "\n               rua: " + rua + "\n               bairro: " + bairro + "\n               cep: " + cep + "\n               numero: " + numero + "\n          "+'}'+"\n";
    }

    
    
}
