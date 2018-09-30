package casoPratico2.pee.mecproc;

import java.util.Iterator;
import java.util.LinkedList;

import casoPratico2.pee.PassoSolucao;
import casoPratico2.pee.Solucao;

public class Percurso implements Solucao{
	private LinkedList<PassoSolucao> percurso;
	public Percurso() {
		percurso = new LinkedList<PassoSolucao>();
	}
	public int getDimensao() {
		return percurso.size();
	}
	public double getCusto() {
		if(percurso.isEmpty()) return 0;
		return percurso.getLast().getCusto();
	}
	public Iterator<PassoSolucao> iterator(){
		return percurso.iterator();
	}
	public void juntarInicio(No no) {
		percurso.addFirst(no);
	}
	
}
