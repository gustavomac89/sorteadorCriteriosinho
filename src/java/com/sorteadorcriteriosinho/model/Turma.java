package com.sorteadorcriteriosinho.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Turma {
    	
	@id
	private int id;
	private String nome;
	private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

	

}
