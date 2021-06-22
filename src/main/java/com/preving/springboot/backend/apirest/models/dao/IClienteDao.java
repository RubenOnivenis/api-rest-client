package com.preving.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.preving.springboot.backend.apirest.models.entity.*;

public interface IClienteDao extends CrudRepository<Cliente, Long>{ //cliente es la tabla y Long es tipo de dato de la CP de la tabla
	
}
