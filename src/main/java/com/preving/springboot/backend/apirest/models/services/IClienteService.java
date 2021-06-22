package com.preving.springboot.backend.apirest.models.services;

import java.util.List;

import com.preving.springboot.backend.apirest.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> FindAll();
	
	public Cliente save(Cliente cliente);
	
	public void delete (Long id);
	
	public Cliente findById(Long id);
}
