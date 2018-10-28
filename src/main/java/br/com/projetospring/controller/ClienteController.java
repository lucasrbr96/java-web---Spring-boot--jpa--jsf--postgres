package br.com.projetospring.controller;

import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import javax.inject.Named;
import br.com.projetospring.model.Cliente;
import br.com.projetospring.repository.ClienteRepository;
@Named
public class ClienteController {
	private Cliente cliente = new Cliente();
	@Autowired
	private ClienteRepository cr;
	
	
	private List<Cliente> clientes;
	private Boolean modoEdicao = false;
	
	
	@PostConstruct
	public void init() {
		clientes = cr.findAll();
	}
	public void salvar() {
		
		cr.save(getCliente());
		if(!modoEdicao)
		clientes.add(getCliente());
		cliente = new Cliente();
		modoEdicao=false;
	}
	public void cancelar() {
		modoEdicao = false;
		cliente = new Cliente();	
	}
	
	public void Excluir(Cliente c) {
		cr.delete(c);
		clientes.remove(c);
	}
	
	public void Editar(Cliente c) {
		setCliente(c);
		modoEdicao = true;
		
	}
		public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Boolean getModoEdicao() {
		return modoEdicao;
	}

	public void setModoEdicao(Boolean modoEdicao) {
		this.modoEdicao = modoEdicao;
	}
	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
}
