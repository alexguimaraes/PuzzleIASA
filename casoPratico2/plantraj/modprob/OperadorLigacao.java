package casoPratico2.plantraj.modprob;

import casoPratico2.pee.modprob.Estado;
import casoPratico2.pee.modprob.Operador;

public class OperadorLigacao implements Operador{
	
	private int custoLigacao;
	private Estado locOrigem;
	private Estado locDestino;
	public OperadorLigacao(String locIni, String locFin, int custo) {
		this.locOrigem = new EstadoLocalidade(locIni);
		this.locDestino = new EstadoLocalidade(locFin);
		this.custoLigacao = custo;
	}
	@Override
	public Estado aplicar(Estado estado) {
		if(estado.equals(locOrigem)) return locDestino;
		//System.out.println(locDestino);
		return null;
	}
	@Override
	public float custo(Estado estado, Estado estadoSuc) {
		return custoLigacao;
	}

}
