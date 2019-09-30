package com.pinheiro.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pinheiro.model.Oportunidade;
import com.pinheiro.repository.OportunidadeRepository;

@Service
public class OportunidadeService{
	
	@Autowired
	private OportunidadeRepository oportunidadeRepository;
	
	public Oportunidade criarNovaOportunidade() {
		Oportunidade oportunidade = new Oportunidade();
		//oportunidade.setId(1L);
		oportunidade.setEmpresa("CPQD");
		oportunidade.setValor(new BigDecimal(1111111));
		oportunidade.setDescricao("Descricao2222344");
		return oportunidadeRepository.save(oportunidade);
	}
	
	public String  removerOportunidade(Long id) {
		if(!oportunidadeRepository.findById(id).isPresent()){
			return "Oportunidade nao encontrada";
		}
		oportunidadeRepository.deleteById(id);
		return "OK";
	}

}
