package com.thiagomoura.musicmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiagomoura.musicmc.domain.Artista;


@Repository
public interface ArtistaRepository extends JpaRepository<Artista, Integer>{
	
	
}
