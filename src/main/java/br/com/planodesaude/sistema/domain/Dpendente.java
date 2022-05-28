package br.com.planodesaude.sistema.domain;

import java.util.UUID;

public class Dpendente {
	
	
	private UUID id;
	private String nome;
	private String cpf;
	public UUID getId(){
		return id;
	}	
	public Dpendente() {
		super();
	}
	public Dpendente(UUID id, String nome, String cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
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
	public void setId(UUID id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Dpendente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", getId()=" + getId() + ", getNome()="
				+ getNome() + ", getCpf()=" + getCpf() + "]";
	}

	
	
	
		
}
	
