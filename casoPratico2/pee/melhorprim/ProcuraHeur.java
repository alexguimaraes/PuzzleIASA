package casoPratico2.pee.melhorprim;

import casoPratico2.pee.Solucao;
import casoPratico2.pee.modprob.ProblemaHeur;

public interface ProcuraHeur {
	public Solucao resolver(ProblemaHeur problema);
	public Solucao resolver(ProblemaHeur problema, int profMax);
}
