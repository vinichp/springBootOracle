package com.pinheiro.service;

import java.math.BigDecimal;

import com.pinheiro.model.Oportunidade;


public class OportunidadeNotService{
	

	public Oportunidade criarNovaOportunidade() {
		Oportunidade oportunidade = new Oportunidade();
		//oportunidade.setId(1L);
		oportunidade.setEmpresa("CPQD");
		oportunidade.setValor(new BigDecimal(1111111));
		oportunidade.setDescricao("Descricao2222344");
		return oportunidade;
	}
	
	public String  removerOportunidade(Long id) {
		return "OK";
	}

}
