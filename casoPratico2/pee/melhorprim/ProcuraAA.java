package casoPratico2.pee.melhorprim;

import casoPratico2.pee.mecproc.No;
import casoPratico2.pee.modprob.ProblemaHeur;

public class ProcuraAA extends ProcuraMelhorPrim<ProblemaHeur> implements ProcuraHeur{

	@Override
	protected double f(No no) {
		return problema.heuristica(no.getEstado()) + no.getCusto();
	}

}
