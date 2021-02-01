package com.thiagomoura.musicmc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiagomoura.musicmc.domain.Artista;
import com.thiagomoura.musicmc.repositories.ArtistaRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class ArtistaService {
	
	@Autowired
	private ArtistaRepository repo;
	
	public Artista find(Integer id) throws ObjectNotFoundException {
		Optional<Artista> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Artista.class.getName()));
	}
}
