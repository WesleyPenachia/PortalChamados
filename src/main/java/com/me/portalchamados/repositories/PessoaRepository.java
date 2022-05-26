package com.me.portalchamados.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.me.portalchamados.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
