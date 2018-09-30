package casoPratico2.pee.melhorprim;

import java.util.Comparator;
import casoPratico2.pee.mecproc.MecanismoProcura;
import casoPratico2.pee.mecproc.No;
import casoPratico2.pee.mecproc.mem.MemoriaPrioridade;
import casoPratico2.pee.mecproc.mem.MemoriaProcura;
import casoPratico2.pee.modprob.Problema;

public abstract class ProcuraMelhorPrim<P extends Problema> extends MecanismoProcura<P> implements Comparator<No>{

	@Override
	protected MemoriaProcura iniciarMemoria() {
		return new MemoriaPrioridade(this);
	}
	public int compare(No o1, No o2) {
		return Double.compare(f(o1), f(o2));
	}
	protected abstract double f(No no);
}
//se o no em memoria for null vou inserir o no na fronteira e no exploradors
//se for != null vou ter de fazer uma comparacao se o custo do no for menor que o custo do no em memoria insiro o no