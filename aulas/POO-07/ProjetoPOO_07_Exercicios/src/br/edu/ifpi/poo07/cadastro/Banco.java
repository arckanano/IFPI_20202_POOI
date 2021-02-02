package br.edu.ifpi.poo07.cadastro;


import br.edu.ifpi.poo07.entidades.AplicacaoException;
import br.edu.ifpi.poo07.entidades.Conta;
import br.edu.ifpi.poo07.entidades.Poupanca;

public class Banco {
	private Conta[] contas;
	private int indice = 0;

	// Construtores
	public Banco() {
		contas = new Conta[1];
	}

	public Banco(int tamanho) {
		contas = new Conta[tamanho];
	}
	//

	public void inserir(Conta c) {
		if (indice == contas.length) { 
			throw new AplicacaoException("N�mero m�ximo de contas atingido");
		}
		contas[indice] = c;
		indice++;
	}

	public Conta consultar(String numero) {
		Conta c = null;
		for (int i = 0; i < indice; i++) {
			if (contas[i].getNumero().equals(numero)) {
				c = contas[i];
				break;
			}
		}
		
		
		if (c == null) {
			throw new AplicacaoException("Conta n�o encontrada.");
		}

		return c;
	}

	private int consultarIndice(String numero) {
		int pos = -1;
		for (int i = 0; i < indice; i++) {
			if (contas[i].getNumero().equals(numero)) {
				pos = i;
				break;
			}
		}
		
		
		if (pos == -1) {
			throw new AplicacaoException("Conta n�o encontrada.");
		}

		
		return pos;
	}

	public void debitar(String numero, double valor) {
		Conta c;
		c = consultar(numero);
		c.sacar(valor);
	}

	public void creditar(String numero, double valor) {
		Conta c;
		c = consultar(numero);
		c.depositar(valor);
	}
	
	public void transferir(String numCredito, String numDebito, double valor) {
		Conta contaCredito = consultar(numCredito);
		Conta contaDebito = consultar(numDebito);
		
		contaCredito.transferir(contaDebito, valor);
		
	}

	public void alterar(Conta c) {
		int indice = consultarIndice(c.getNumero());
		contas[indice] = c;
	}

	public void excluir(String numero) {
		int posicao = consultarIndice(numero);
		for (int i = posicao; i < indice; i++) {
			contas[i] = contas[i + 1];
		}

		indice--;
	}
	
	public void renderJuros(String numero) {
		Conta c = consultar(numero);
		
		if (!(c instanceof Poupanca)) {
			throw new AplicacaoException("A conta n�o � uma poupan�a.");
		}
		
		((Poupanca) c).renderJuros();
	}
	
	public int retornaQuantidade() {
		return indice;
	}
	
	public double retornaValorTotal() {
		double total = 0;
		for (int i = 0; i < indice; i++) {
			total += contas[i].getSaldo();
		}
		
		return total;
	}
	
	public double retornaMediaValores() {
		return retornaValorTotal()/retornaQuantidade();
	}
}