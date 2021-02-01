package com.thiagomoura.musicmc.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thiagomoura.musicmc.domain.Artista;

@RestController
@RequestMapping(value = "/artistas")
public class ArtistaResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Artista> listar() {
		Artista a1 = new Artista(1,"Pink Floyd","Inglaterra"); 
		Artista a2 = new Artista(2,"Sepultura","Brasileiro");
		Artista a3 = new Artista(3,"Cassia Eller","Brasileiro"); 
		Artista a4 = new Artista(4, "Metallica","USA");
		List<Artista> artists = Arrays.asList(a1, a2, a3, a4); 
		return artists;
	}
}
