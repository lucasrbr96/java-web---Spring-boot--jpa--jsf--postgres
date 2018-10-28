package br.com.projetospring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cliente {
	
	@Id @GeneratedValue(strategy= GenerationType.SEQUENCE)
	private long id;
	private String nome;
	private String email;
	private int telefone;
	@ManyToOne
	@JoinColumn
	private Estado estado;
	
	public Cliente(String nome, String email, int telefone,Estado estado){
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.estado = estado;
		
	}
	public Cliente() {}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
	

}
