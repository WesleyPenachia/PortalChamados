package com.me.portalchamados.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.me.portalchamados.domain.Chamado;


public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
