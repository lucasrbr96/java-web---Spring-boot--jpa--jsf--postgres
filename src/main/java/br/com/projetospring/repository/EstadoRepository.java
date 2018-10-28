package br.com.projetospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.projetospring.model.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Integer>{
	
	@Query("select c from Estado c where c.id=:id")
	public Estado findIdEstado(@Param("id")Integer integer);

}
