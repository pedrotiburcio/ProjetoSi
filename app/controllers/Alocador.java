package controllers;

import java.util.ArrayList;
import java.util.List;

import models.GradeCurricular;
import models.Disciplina;
import models.Periodo;

public class Alocador {

	private List<Periodo> periodos;
	private static final int MINIMO_DE_CREDITOS = 16;
    private static final int MAXIMO_DE_CREDITOS = 28;
    private GradeCurricular grade;
    private Periodo primeiroPeriodo;
    
    
    //CONTROLLER: É o responsável por lidar com um evento de uma interface de entrada no sistema.
    public Alocador(GradeCurricular grade) {
    	this.grade = grade;
    	periodos = new ArrayList<Periodo>();
    	primeiroPeriodo = new Periodo();
	}
    
    
    public void adicionaPeriodo() throws Exception{
		if (this.quantidadeDePeriodos() < 10)
			periodos.add(new Periodo());
		else
			throw new Exception("Não pode adicionar mais períodos.");
	}
    
    
    public int minimoDeCreditos() {
		return this.MINIMO_DE_CREDITOS;
	}
	
	public int maximoDeCreditos() {
		return this.MAXIMO_DE_CREDITOS;
	}
	
    public void adicionaPrimeiroPeriodo() throws Exception{
		primeiroPeriodo.adicionaDisciplina(grade.criaOPrimeiroPeriodo().get(0));
		primeiroPeriodo.adicionaDisciplina(grade.criaOPrimeiroPeriodo().get(1));
		primeiroPeriodo.adicionaDisciplina(grade.criaOPrimeiroPeriodo().get(2));
		primeiroPeriodo.adicionaDisciplina(grade.criaOPrimeiroPeriodo().get(3));
		primeiroPeriodo.adicionaDisciplina(grade.criaOPrimeiroPeriodo().get(4));
		primeiroPeriodo.adicionaDisciplina(grade.criaOPrimeiroPeriodo().get(5));
		this.periodos.add(primeiroPeriodo);
	}
    
    public List<Periodo> getPeriodos() {
        return this.periodos;
	}
    
    public void setPeriodos(List<Periodo> periodos) {
		this.periodos = periodos;
	}
    
    public GradeCurricular getGradeCurricular(){
		return grade;
	}
    
    
    public int quantidadeDePeriodos() {
		return this.getPeriodos().size();
	}
    
    public Periodo periodo(int periodo) {
		return this.getPeriodos().get(periodo);
	}
    
    public List<Disciplina> getDisciplinasDadoPeriodo(int indicePeriodo) {
		return this.periodo(indicePeriodo).getDisciplinas();
	}
    
    public int getCreditosDeUmPeriodo(int periodo) {
		return this.periodo(periodo).getTotalDeCreditos();
	}
    
    public int quantidadeDeDisciplinasNoPeriodo(int periodo) {
		return getDisciplinasDadoPeriodo(periodo).size();
	}
    
    public void adicionaDisciplinaEmPeriodo(int indicePeriodo, String nome) throws Exception{
		Disciplina disciplina = grade.pesquisaDisciplina(nome);
		boolean verificaPreRequisitos = true;
		if (disciplina.getPreRequisitos().length > 0) {
			for (int i = 0; i < disciplina.getPreRequisitos().length; i++) {
				if (!this.jaFoiAdicionada(disciplina.getPreRequisitos()[i])) {
					verificaPreRequisitos = this.jaFoiAdicionada(disciplina.getPreRequisitos()[i]);
				}
			}	
		}
		
		if ((indicePeriodo != 0) && !this.jaFoiAdicionada(disciplina) && verificaPreRequisitos && (this.periodo(indicePeriodo).getTotalDeCreditos() 
				+ disciplina.getCreditos() <= maximoDeCreditos())) {
			this.periodo(indicePeriodo).adicionaDisciplina(disciplina);
		} else{
			if(indicePeriodo == 0)throw new Exception("Não é possível adicionar disciplinas no primeiro periodo.");
			if(this.jaFoiAdicionada(disciplina))throw new Exception("Disciplina já está alocada");
			if(!verificaPreRequisitos) throw new Exception("Os pré-requisitos não foram alocados.");
			if(this.periodo(indicePeriodo).getTotalDeCreditos() + disciplina.getCreditos() > maximoDeCreditos())throw new Exception("Vai ultrapassar o maximo de creditos.");
		}
			
	}
    
    public void removeDisciplinaDoPeriodo(int periodo, String nomeDaDisciplina) throws Exception {
		Disciplina disciplina = grade.pesquisaDisciplina(nomeDaDisciplina);
		this.periodo(periodo).removeDisciplina(disciplina);
		if(periodo != 0){
			for (int i = periodo; i < getPeriodos().size(); i++) {
				for (int j = 0; j < periodo(i).getDisciplinas().size(); j++) {
					for (int k = 0; k < periodo(i).getDisciplinas().get(j).getPreRequisitos().length; k++) {
						if (periodo(i).getDisciplinas().get(j).getPreRequisitos()[k].equals(disciplina)) {
							removeDisciplinaDoPeriodo(i, periodo(i).getDisciplinas().get(j).getNome());
						}
					}
				}
			}
		}else {
			throw new Exception("Nao é possível remover uma disciplina do primeiro periodo.");
		}
		
	}
    
    public boolean jaFoiAdicionada(Disciplina disciplina){
		boolean resp = false;
		for (int i = 0; i < periodos.size(); i++) {
			for (int j = 0; j < periodos.get(i).getDisciplinas().size(); j++) {
				if(periodos.get(i).getDisciplinas().get(j).equals(disciplina)){
					resp = true;
				}
			}
		}
		return resp;
	}
    
    
}