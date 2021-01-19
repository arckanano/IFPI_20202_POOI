package br.edu.ifpi.poo.exercicio06.estoque;

public class Produto {
	int id;
	String descricao;
	double valor;
	int quantidade;

	Produto(int codigo, String descricao, double valor, int quantidade) {
		this.id = codigo;
		this.descricao = descricao;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	void baixar(int quantidade) {
		this.quantidade -= quantidade;

	}

	void repor(int quantidade) {
		this.quantidade += quantidade;
	}

	@Override
	public boolean equals(Object produto) {

		boolean resultado = false;

		if (produto instanceof Produto)
			resultado = this.id == ((Produto) produto).id;
		
		return resultado;
	}
}