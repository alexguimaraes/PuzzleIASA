package casoPratico2.pee.melhorprim;


import casoPratico2.pee.mecproc.No;
import casoPratico2.pee.modprob.ProblemaHeur;

public class ProcuraSofrega extends ProcuraMelhorPrim<ProblemaHeur> implements ProcuraHeur{

	@Override
	protected double f(No no) {
		return problema.heuristica(no.getEstado());
	}
}
