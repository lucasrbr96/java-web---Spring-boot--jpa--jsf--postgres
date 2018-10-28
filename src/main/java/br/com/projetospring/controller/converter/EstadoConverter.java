package br.com.projetospring.controller.converter;


import javax.faces.component.UIComponent;

import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.projetospring.model.Estado;
import br.com.projetospring.repository.EstadoRepository;


@Component
public class EstadoConverter implements Converter<Estado> {
	@Autowired
	private EstadoRepository er;

	@Override
	public Estado getAsObject(FacesContext context, UIComponent component, String value) {
		if(value.isEmpty())
			return null;
		try {
		Estado estado =	 er.findIdEstado(new Integer(value));
		return estado;
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Estado value) {
		if(value instanceof Estado) {
			Estado estado =(Estado)value;
			return estado.getId().toString();		
		}else {
		return null;
		}
	}


}
