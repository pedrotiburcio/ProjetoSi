package models;

import java.util.Arrays;

public class Disciplina {
	
	String nome;
	int creditos;
	Disciplina[] preRequisitos; 
	
	//CREATOR: A Disciplina conhece seus atributos(nome, creditos e preRequisitos).
	public Disciplina(String nome, int creditos, Disciplina[] preRequisitos) {
		this.nome = nome;
		this.creditos = creditos;
		this.preRequisitos = preRequisitos;
	}
	
	//INFORMATION EXPERT: A disciplina possui (é o especialista em) seu nome.
	public String getNome(){
		return this.nome;
	}
	
	//INFORMATION EXPERT: A disciplina possui (é o especialista em) seus créditos.
	public int getCreditos(){
		return this.creditos;
	}

	//INFORMATION EXPERT: A disciplina possui (é o especialista em) seus pré-requisitos.
	public Disciplina[] getPreRequisitos(){
		return this.preRequisitos;
	}
	
	//INFORMATION EXPERT: A disciplina é o especialista nos seus pré-requisitos.
	public String preRequisitos(){
		String preRequisitos = "";
		for (int i = 0; i < this.preRequisitos.length; i++){
			if (i < this.preRequisitos.length-1) {
				preRequisitos += this.preRequisitos[i] + ", ";	
			} else {
				preRequisitos += this.preRequisitos[i];
			}
		}
		return preRequisitos;
	}
	
	@Override
	public boolean equals(Object obj) {
		Disciplina d1 = (Disciplina) obj;
		if (creditos != d1.creditos){
			return false;
		}
		if (!getNome().equals(d1.getNome())){
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return getNome() + "; ";
	}
	
}