package br.edu.ifpi.poo.exercicio06.veiculos;

public class Carro extends Veiculo {
	String modelo;
	
	public Carro(String placa, int ano, String modelo) {
		super(placa, ano);
		this.modelo = modelo;
	}
	
}
