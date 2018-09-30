package casoPratico2.plantraj.modprob;

import casoPratico2.pee.modprob.Estado;
import casoPratico2.pee.modprob.Problema;

public class ProblemaPlanTraj extends Problema{
	private EstadoLocalidade estadoFinal;
	public ProblemaPlanTraj(String locIni, String locFin, OperadorLigacao[] operadores) {
		super(new EstadoLocalidade(locIni), operadores);
		estadoFinal = new EstadoLocalidade(locFin);
	}
	public boolean objectivo(Estado estado) {
		return estado.equals(estadoFinal);
	}
}
