package casoPratico2.pee;

import casoPratico2.pee.modprob.Estado;
import casoPratico2.pee.modprob.Operador;

public interface PassoSolucao {
	Estado getEstado();
	Operador getOperador();
	double getCusto();
}
