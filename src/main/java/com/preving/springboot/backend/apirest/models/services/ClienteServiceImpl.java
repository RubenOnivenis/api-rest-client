package com.preving.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

import com.preving.springboot.backend.apirest.models.dao.IClienteDao;
import com.preving.springboot.backend.apirest.models.entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired private IClienteDao clienteDao;

 				//@Transactional(readOnly = true) @Transactional se puede quitar porque viene implementado en IClienteDao
	@Override	//En IClienteDao tenemos implementados los metodos del CrudRepository	
	public List<Cliente> FindAll() {
		// TODO Auto-generated method stub
		
		return (List<Cliente>) clienteDao.findAll(); //El findAll es del CrudRepository
	}

	@Override
	public Cliente save(Cliente cliente) {
		
		return clienteDao.save(cliente);
	}

	@Override
	public void delete(Long id) {
		
		clienteDao.deleteById(id);
	}

	@Override
	public Cliente findById(Long id) {
		
		return clienteDao.findById(id).orElse(null); //Si lo encuentra devuelve id, sino lo encuentra te devuelve null
	}

	
}
