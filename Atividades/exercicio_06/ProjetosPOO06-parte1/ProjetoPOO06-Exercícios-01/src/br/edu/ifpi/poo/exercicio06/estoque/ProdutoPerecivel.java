package br.edu.ifpi.poo.exercicio06.estoque;

import java.time.LocalDate;

public class ProdutoPerecivel extends Produto {

	LocalDate dataDeValidade;
	
	ProdutoPerecivel(int codigo, String descricao, double valor, 
					 int quantidade, LocalDate dataDeValidade) {
		super(codigo, descricao, valor, quantidade);
		this.dataDeValidade = dataDeValidade;
	}
	
	boolean estaValido() {
		/*
		if (dataDeValidade.isAfter(LocalDate.now())) {
			return true;
		} else {
			return false;
		}
		*/
	
		return dataDeValidade.isAfter(LocalDate.now());
	}
	

}
