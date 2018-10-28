package br.com.projetospring.repository;

import static org.junit.Assert.assertEquals;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.projetospring.model.Cliente;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)

public class TestClienteRepository {
	@Autowired
	EntityManager em;
	@Autowired	
	ClienteRepository cliR;
	@Test
	public void salvarContato() {
		Cliente c = new Cliente("user1","user@gmail.com",9999);
		Cliente cliS = cliR.save(c);
		assertEquals(cliS, c);
		
	}
	@Test
	public void buscarPorEmail() {
		
		Cliente c = new Cliente("user1","user@gmail.com",9999);
		em.persist(c);
		Cliente cliS = cliR.buscarPorEmail(c.getEmail());
		assertEquals(cliS, c);
		
	}
	
	
}
