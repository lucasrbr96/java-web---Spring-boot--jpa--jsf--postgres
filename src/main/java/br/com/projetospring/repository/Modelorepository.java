package br.com.projetospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetospring.model.Modelo;

public interface Modelorepository extends JpaRepository<Modelo, Long> {
		
}
