package casoPratico2.pee.mecproc;

import casoPratico2.pee.Solucao;
import casoPratico2.pee.mecproc.mem.MemoriaProcura;
import casoPratico2.pee.modprob.Estado;
import casoPratico2.pee.modprob.Operador;
import casoPratico2.pee.modprob.Problema;

public abstract class MecanismoProcura<P extends Problema>{
	private MemoriaProcura memoriaProcura;
	private int nosExplorados = 1;
//	private Problema problema;
	
	public MecanismoProcura() {
		  memoriaProcura = iniciarMemoria();
	}
	
	protected abstract MemoriaProcura iniciarMemoria();
	protected P problema;
	
	public Solucao resolver(P problema) {
		return resolver(problema, Integer.MAX_VALUE);	
	}
	
	public Solucao resolver(P problema, int profMax) {
		this.problema = problema;
		memoriaProcura.limpar();
		No noInicial = new No(problema.getEstadoInicial());
		memoriaProcura.inserir(noInicial);
		while(!memoriaProcura.fronteiraVazia()) {
			No no = memoriaProcura.remover();
			if(problema.objectivo(no.getEstado())) {
				getNosExplorados();
				return gerarSolucao(no);
			}
				
			else { 
				if(no.getProfundidade() < profMax) {
					expandir(no);
					nosExplorados++;
				}
			}
		}
		return null;
	}
	
	private void expandir(No no) {
		Estado estado = no.getEstado();
//		System.out.println(estado);
		Operador[] operadores = problema.getOperadores();
		for(Operador operador: operadores) {
			Estado estadoSuc = operador.aplicar(estado);
//			System.out.println(estadoSuc);
			if(estadoSuc != null) {
				No noSuc = new No(estadoSuc, operador, no);
				memoriaProcura.inserir(noSuc);
			}
		}
	}
	
	private Solucao gerarSolucao(No noFinal) {
		Percurso percurso = new Percurso();
		No no = noFinal;
		while(no != null) {
			percurso.juntarInicio(no);
			No antecessor = no.getAntecessor();
			no = antecessor;
		}
		return percurso;
	}
	
	public int getNosExplorados() {
		return nosExplorados;
	}
	
	public int getMaxNosFronteira() {
		int maxNosFronteira = -1;
		maxNosFronteira = Math.max(maxNosFronteira, memoriaProcura.getFronteira().size());
		return maxNosFronteira;
	}
}
