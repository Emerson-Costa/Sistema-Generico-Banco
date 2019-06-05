
package classes;

public class Agencia {
    
  
  private String idAgencia;  

    public String getIdAgencia() {
        return idAgencia;
    }

    public void setIdAgencia(String idAgencia) {
        this.idAgencia = idAgencia;
    }
    
    public boolean consultar(String agencia){
        if(idAgencia.equals(agencia)){
            return true;
        }
        return false;
    }
}
