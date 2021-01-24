package br.edu.ifpi.poo.banco.testes;

import br.edu.ifpi.poo.banco.cadastros.Banco;
import br.edu.ifpi.poo.banco.entidade.Conta;
import br.edu.ifpi.poo.banco.entidade.ContaImposto;
import br.edu.ifpi.poo.banco.entidade.Poupanca;

public class TestaBanco {
	public static void main(String[] args) {
		Conta c = new Conta("1",100);
		Poupanca p = new Poupanca("2", 200, 1);
		/*
		p.sacar(50);
		System.out.println(p.getSaldo());
		p.renderJuros();
		System.out.println(p.getSaldo());
		//c.getSaldo() = 100 / p.getSaldo() = 151.50
		p.transferir(c, 1.5);
		System.out.println(c.getSaldo());
		System.out.println(p.getSaldo());
		
		c.transferir(p, c.getSaldo());
		System.out.println(c.getSaldo());
		System.out.println(p.getSaldo());
		*/
		
		Banco b = new Banco(5);
		b.inserir(c);
		b.inserir(p);
		/*
		b.consultar("2");
		System.out.println(p.getSaldo());
		
		b.transferir("1", "2", b.consultar("1").getSaldo());
		System.out.println(b.consultar("1").getSaldo());
		System.out.println(b.consultar("2").getSaldo());
		*/
		
		Conta poupanca = new Poupanca("6", 100, 10);
		//((Poupanca) poupanca).renderJuros();
		b.inserir(poupanca);
		b.renderJuros("6");
		System.out.println(b.consultar("6").getSaldo());
		

		ContaImposto ci = new ContaImposto("7",100);
		ci.sacar(100);
		System.out.println(ci.getSaldo());
	}
}
