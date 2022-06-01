package br.com.planodesaude.sistema.domain;

import org.hibernate.mapping.List;

import br.com.planodesaude.sistema.repositories.PessoaRepository;

import java.util.UUID;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import org.hibernate.mapping.List;

public class Pessoa extends PessoaRepository{

	
	private UUID id;
	
	private String nome;
	private String cpf;
	private String email;
	/**private ArrayList List<Dependente>dependentes;*/
	
	
	public Pessoa() {
		super();
	}


	public Pessoa(UUID id, String nome, String cpf, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}


	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", getNome()=" + getNome() + ", getCpf()="
				+ getCpf() + ", getEmail()=" + getEmail() + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
