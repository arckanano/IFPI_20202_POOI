package br.edu.ifpi.poo.exercicio06.estoque;

import java.time.LocalDate;

public class TestaEstoque {

	public static void main(String[] args) {
		Produto p = new Produto(1, "abridor de lata", 5.00, 10);
		
		LocalDate data1 = LocalDate.of(2021, 12, 01);
		ProdutoPerecivel pp1 = new ProdutoPerecivel(2, "arroz", 9.00, 100, data1);
		LocalDate data2 = LocalDate.of(2020, 12, 01);
		ProdutoPerecivel pp2 = new ProdutoPerecivel(3, "feijao", 4.00, 50, data2);
		
		System.out.println(pp1.estaValido());
		System.out.println(pp2.estaValido());
		
		Estoque estoque = new Estoque();
		estoque.inserir(p);
		estoque.inserir(pp1);
		estoque.inserir(pp2);
		
		Produto produtoProcurado = estoque.consultar(pp1);
		System.out.println(produtoProcurado.descricao);
		
		estoque.excluir(p);
		Produto produtoProcurado2 = estoque.consultar(p);
		if (produtoProcurado2 == null) {
			System.out.println("não encontrado");
		} else {
			System.out.println("não passará aqui?");
		}
		
		estoque.inserir(pp1);
		ProdutoPerecivel pp3 = new ProdutoPerecivel(0, "feijao" , 0, 0, null);
		estoque.inserir(pp3);
		
		System.out.println(pp1.quantidade);
		estoque.repor(2, 100000);
		System.out.println(pp1.quantidade);
		
		pp1.equals("x");
	}

}
