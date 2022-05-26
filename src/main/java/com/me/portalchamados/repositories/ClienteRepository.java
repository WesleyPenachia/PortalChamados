package com.me.portalchamados.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.me.portalchamados.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
