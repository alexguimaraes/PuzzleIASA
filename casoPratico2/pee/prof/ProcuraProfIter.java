package casoPratico2.pee.prof;

import casoPratico2.pee.Solucao;
import casoPratico2.pee.modprob.Problema;

public class ProcuraProfIter extends ProcuraProf{
	
	private int incProf;
	
	public ProcuraProfIter(int incProf) {
		this.incProf = incProf;
	}
	public int getIncProf() {
		return incProf;
	}
	public void setIncProf(int incProf) {
		this.incProf = incProf;
	}
	public Solucao resolver(Problema problema, int profMax) {
		for(int i = incProf; i < profMax; i++) {
			ProcuraProf procura = new ProcuraProf();
			Solucao solucao = procura.resolver(problema, profMax);
			if(solucao != null) return solucao;
		}
		return null;
	}
}
