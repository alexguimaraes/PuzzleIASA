package casoPratico2.pee.mecproc;

import casoPratico2.pee.PassoSolucao;
import casoPratico2.pee.modprob.Estado;
import casoPratico2.pee.modprob.Operador;

public class No implements PassoSolucao{
	private int profundidade = 0;
	private double custo = 0;
	private No antecessor;
	private Operador operador;
	private Estado estado;
	
	public No(Estado estado) {
		this.estado = estado;
	}
	public No(Estado estado, Operador operador, No antecessor) {
		this(estado);
		this.operador = operador;
		this.antecessor = antecessor;
		profundidade = antecessor.profundidade + 1;
		custo = antecessor.custo + operador.custo(antecessor.getEstado(), estado);
	}
	public Estado getEstado() {
		return estado;
	}
	public Operador getOperador() {
		return operador;
	}
	public No getAntecessor() {
		return antecessor;
	}
	public int getProfundidade() {
		return profundidade;
	}
	public double getCusto() {
		return custo;
	}
}
