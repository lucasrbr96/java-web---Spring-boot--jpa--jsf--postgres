package br.com.projetospring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Modelo {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	
	
	private long ref;
	
	public Modelo(long ref){
		this.ref =ref;
	}
	public Modelo() {}

	public long getRef() {
		return ref;
	}

	public void setRef(long ref) {
		this.ref = ref;
	}
	
		
}
