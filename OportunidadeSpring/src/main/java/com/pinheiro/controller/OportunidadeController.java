package com.pinheiro.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pinheiro.model.Oportunidade;
import com.pinheiro.repository.OportunidadeRepository;
import com.pinheiro.service.OportunidadeService;

@RestController
@RequestMapping("/oportunidades")
public class OportunidadeController {

	@Autowired
	private OportunidadeRepository oportunidadeRepository;
	
	@Autowired
	private OportunidadeService oportunidadeService;
	
	@GetMapping
	public List<Oportunidade> listar() {
		return oportunidadeRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Oportunidade> obter(@PathVariable Long id) {
		return oportunidadeRepository.findById(id);
	}
	
	@GetMapping("/criarOportunidade")
	public Oportunidade salvar() {
		return oportunidadeService.criarNovaOportunidade();
	}
	
	@GetMapping("/remover/{id}")
	public String removerOportunidade(@PathVariable Long id) {
		 return oportunidadeService.removerOportunidade(id);
		 
		 
	}
}
