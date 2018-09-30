package casoPratico2.resPuzzle;

import casoPratico2.pee.PassoSolucao;
import casoPratico2.pee.Solucao;
import casoPratico2.pee.larg.ProcuraLarg;
import casoPratico2.pee.melhorprim.ProcuraAA;
import casoPratico2.pee.melhorprim.ProcuraCustoUnif;
import casoPratico2.pee.melhorprim.ProcuraSofrega;
import casoPratico2.pee.prof.ProcuraProf;
import casoPratico2.pee.prof.ProcuraProfIter;
import casoPratico2.resPuzzle.modprob.OperadorMovPosVazia;
import casoPratico2.resPuzzle.modprob.ProblemaPuzzle;
import puzzle.Puzzle;
import puzzle.Puzzle.Movimento;

public class PuzzleSolver{
	
	
	public static void main(String[] args) {
		int[][] confA = {{1,2,3}, {8,4,5}, {6,7,0}};
		int[][] confB = {{8, 4, 5}, {6, 1, 2}, {3, 7, 0}};
		int[][] confFinal = {{1,2,3}, {4,5,6}, {7,8,0}};
		
		Puzzle pA = new Puzzle(confA);
		Puzzle pB = new Puzzle(confB);
		Puzzle pF = new Puzzle(confFinal);
		
		OperadorMovPosVazia[] operadores = definirOperadores();
		ProblemaPuzzle problema = new ProblemaPuzzle(pB, pF, operadores);
//		ProcuraLarg procura = new ProcuraLarg();
		ProcuraProf procura = new ProcuraProf();
//		ProcuraProfIter procura = new ProcuraProfIter(1);
//		ProcuraCustoUnif procura = new ProcuraCustoUnif();
//		ProcuraAA procura = new ProcuraAA();
//		ProcuraSofrega procura = new ProcuraSofrega();
		
		Solucao solucao = procura.resolver(problema, 26);

		mostrarTrajecto(solucao);
		
		System.out.println("Nós Explorados: " + procura.getNosExplorados());
		System.out.println("Max Nós Gerados: " + procura.getMaxNosFronteira());
	}
	
	private static OperadorMovPosVazia[] definirOperadores() {
		OperadorMovPosVazia[] operadores = {
				new OperadorMovPosVazia(Movimento.ESQ),
				new OperadorMovPosVazia(Movimento.DIR),
				new OperadorMovPosVazia(Movimento.CIMA),
				new OperadorMovPosVazia(Movimento.BAIXO)};
		return operadores;
	}
	
	private static void mostrarTrajecto(Solucao solucao) {
		if(solucao != null) {
			System.out.print("Trajecto:\n");
			for (PassoSolucao no: solucao) System.out.println("Estado: " + no.getEstado() + " Custo: " + no.getCusto());
		}
		else System.out.println("Trajecto não encontrado");	
	}
}
