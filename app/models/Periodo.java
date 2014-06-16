package models;

import java.util.ArrayList;
import java.util.List;

public class Periodo {
	
	//Creator: Um período é formado por disciplinas, podendo portanto criar instâncias dela.
	private List<Disciplina> listaDisciplinas;
	
	public Periodo() {
		this.listaDisciplinas = new ArrayList<Disciplina>();
	}
	

	//INFORMATION EXPERT: O perído é o especialista no total de créditos.
	public int getTotalDeCreditos(){
		int resultado = 0;
		for (int i = 0; i < this.getDisciplinas().size(); i++) {
			resultado += getDisciplinas().get(i).getCreditos();
		}
		return resultado;
	}
	

	//INFORMATION EXPERT: O perído tem a lista de todas as disciplinas que a ele pertencem.
	public List<Disciplina> getDisciplinas(){
		return listaDisciplinas;
	}
	

	// CREATOR: O Período guarda objetos do tipo disciplina, podendo alterá-los.
	public void setDisciplina(List<Disciplina> disciplinas){
		this.listaDisciplinas = disciplinas;
	}
	

	//INFORMATION EXPERT: A responsabilidade de adicionar as disciplinas é do período.
	public void adicionaDisciplina(Disciplina disciplina) throws Exception{
		listaDisciplinas.add(disciplina);
	}
	
	// CREATOR: Tem a lista de disciplinas e pode removê-las (uma de cada vez).
	public void removeDisciplina(Disciplina disciplina){
		this.getDisciplinas().remove(disciplina);
	}
	
	// INFORMATION EXPERT: Tem a lista de disciplinas.
	public int creditosPorDisciplina(Disciplina disciplina) {
		return disciplina.getCreditos();
	}
	
	public String toString() {
		return listaDisciplinas.toString();
	}
	
	//INFORMATION EXPERT: O período possui a informação necessária para saber se uma disciplina está ou não nele.
	public boolean contains(Disciplina disciplina){
		boolean resp = false;
		for(int i = 0; i < listaDisciplinas.size(); i++){
			if(listaDisciplinas.get(i).equals(disciplina)){
				resp = true;
			}
		}
		return resp;
	}
	
}
