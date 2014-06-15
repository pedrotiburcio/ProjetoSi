package models;
import play.data.validation.Constraints.Required;

public class Task {
	@Required
    public int idPeriodo;
    
	@Required
    public String inputNameDisc;
    
    public void setInsercaoDisciplina(String inputNameDisc) {
            this.inputNameDisc = inputNameDisc;
    }
    
    public String getInsercaoDisciplina() {
            return inputNameDisc;
    }
    
    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }
    
    public int getIdPeriodo() {
        return idPeriodo;
    }
}
