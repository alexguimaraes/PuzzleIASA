package casoPratico2.pee.mecproc.mem;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

import casoPratico2.pee.mecproc.No;
import casoPratico2.pee.modprob.Estado;

public class MemoriaProcura {
	protected Queue<No> fronteira;
	protected Map<Estado,No> explorados;
	/**
	 * Queue deriva de Collection
	 * tem o remove, isEmpty, pull,...
	 * @param fronteira
	 */
	public MemoriaProcura(Queue<No> fronteira) {
		this.fronteira = fronteira;
		this.explorados = new HashMap<Estado,No>();
	}
	public void limpar() {
		explorados.clear();
		fronteira.clear();
	}
	public void inserir(No no) {
		No noMem = this.explorados.get(no.getEstado());
		if(noMem == null) {
			fronteira.add(no);
			this.explorados.put(no.getEstado(), no);
		}
		else {
			if(no.getCusto() < noMem.getCusto()) {
				fronteira.add(no);
				this.explorados.put(no.getEstado(), no);
			}
		}
	}
	public No remover() {
		return fronteira.poll();
	}
	public boolean fronteiraVazia() {
		return fronteira.isEmpty();
	}
	public Queue<No> getFronteira(){
		return fronteira;
	}
}
