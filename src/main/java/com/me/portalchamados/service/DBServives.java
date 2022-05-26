package com.me.portalchamados.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.portalchamados.domain.Chamado;
import com.me.portalchamados.domain.Cliente;
import com.me.portalchamados.domain.Tecnico;
import com.me.portalchamados.domain.enums.Perfil;
import com.me.portalchamados.domain.enums.Prioridade;
import com.me.portalchamados.domain.enums.Status;
import com.me.portalchamados.repositories.ChamadoRepository;
import com.me.portalchamados.repositories.ClienteRepository;
import com.me.portalchamados.repositories.TecnicoRepository;

@Service
public class DBServives {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public void instaciaDB() {
		Tecnico tec1 = new Tecnico(null, "wesley", "37214811863", "wesleyikiko@hotmail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Linos test", "97896243440", "linos@hotmail.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "chamado 01", "Primeiro chamado", tec1, cli1);
	
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
	
	
}
