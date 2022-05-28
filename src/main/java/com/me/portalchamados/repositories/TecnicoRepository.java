package com.me.portalchamados.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.me.portalchamados.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {
	
}
