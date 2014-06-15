package models;

import java.util.ArrayList;
import java.util.List;

public class Periodo {
	
	//Creator: Um período é formado por disciplinas
	private List<Disciplina> listaDisciplinas;
	
	public Periodo() {
		this.listaDisciplinas = new ArrayList<Disciplina>();
	}
	
	public int getTotalDeCreditos(){
		int resultado = 0;
		for (int i = 0; i < this.getDisciplinas().size(); i++) {
			resultado += getDisciplinas().get(i).getCreditos();
		}
		return resultado;
	}
	
	public List<Disciplina> getDisciplinas(){
		return listaDisciplinas;
	}
	
	public void setDisciplina(List<Disciplina> disciplinas){
		this.listaDisciplinas = disciplinas;
	}
	
	public void adicionaDisciplina(Disciplina disciplina) throws Exception{
		listaDisciplinas.add(disciplina);
	}
	
	public void removeDisciplina(Disciplina disciplina){
		this.getDisciplinas().remove(disciplina);
	}
	
	public int creditosPorDisciplina(Disciplina disciplina) {
		return disciplina.getCreditos();
	}
	
	public String toString() {
		return listaDisciplinas.toString();
	}
	
}
