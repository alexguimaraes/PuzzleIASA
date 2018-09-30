package casoPratico2.pee.modprob;

public abstract class Problema {
	private Estado estadoInicial;
	private Operador[] operadores;
	
	public Problema(Estado estadoInicial, Operador[] operadores) {
		this.estadoInicial = estadoInicial;
		this.operadores = operadores;
	}
	public Estado getEstadoInicial() {
		return this.estadoInicial;
	}
	public Operador[] getOperadores() {
		return operadores;
	}
	public abstract boolean objectivo(Estado estado);
	
	
}
