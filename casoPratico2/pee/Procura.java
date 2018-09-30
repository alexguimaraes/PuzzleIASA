package casoPratico2.pee;

import casoPratico2.pee.modprob.Problema;

public interface Procura extends DadosProcura{
	Solucao resolver(Problema problema);
	Solucao resolver(Problema problema, int profMax);
}
