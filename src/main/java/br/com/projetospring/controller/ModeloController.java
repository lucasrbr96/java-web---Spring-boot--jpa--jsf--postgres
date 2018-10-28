package br.com.projetospring.controller;

import javax.annotation.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.projetospring.model.Modelo;
import br.com.projetospring.repository.Modelorepository;

@ManagedBean
public class ModeloController {
	@Autowired
	private Modelorepository mr;
	
	//instancaindo a classe para manipular
		private Modelo modelo = new Modelo();
		
		//adicionar modelo
	public void adicionarModelo() {
		mr.save(modelo);
		 modelo = new Modelo();
		 System.out.println("modelo salvo");
	}		
	
	
	
	
	public Modelo getModelo() {
			return modelo;
		}

		public void setModelo(Modelo modelo) {
			this.modelo = modelo;
		}


}
