package casoPratico2.pee.melhorprim;

import casoPratico2.pee.Procura;
import casoPratico2.pee.mecproc.No;
import casoPratico2.pee.modprob.Problema;

public class ProcuraCustoUnif extends ProcuraMelhorPrim<Problema> implements Procura{

	protected double f(No no) {
		return no.getCusto();
	}

}
