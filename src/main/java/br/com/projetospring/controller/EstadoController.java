package br.com.projetospring.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.projetospring.model.Estado;
import br.com.projetospring.repository.EstadoRepository;

@Named
public class EstadoController {
	@Autowired
	private EstadoRepository er;

	private List<Estado> estado;
	@PostConstruct
	public void init() {
		estado = er.findAll();
	}
	
	public List<Estado> getEstado() {
		return estado;
	}
	public void setEstado(List<Estado> estado) {
		this.estado = estado;
	}
}
