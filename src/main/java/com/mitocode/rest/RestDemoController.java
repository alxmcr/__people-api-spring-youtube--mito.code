package com.mitocode.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Persona;
import com.mitocode.repo.IPersonaRepo;

@RestController
@RequestMapping("/personas")
public class RestDemoController {

	@Autowired
	private IPersonaRepo repo;

	@GetMapping
	private List<Persona> listar() {
		return repo.findAll();
	}

	@PostMapping
	private void insertar(@RequestBody Persona per) {
		repo.save(per);
	}

	@PutMapping
	private void modificar(@RequestBody Persona per) {
		repo.save(per);
	}

	@DeleteMapping(value = "/{id}")
	private void modificar(@PathVariable Integer id) {
		repo.deleteById(id);
	}

}
