package casoPratico2.plantraj;

import casoPratico2.pee.PassoSolucao;
import casoPratico2.pee.Solucao;
import casoPratico2.pee.larg.ProcuraLarg;
import casoPratico2.pee.melhorprim.ProcuraCustoUnif;
import casoPratico2.pee.prof.ProcuraProf;
import casoPratico2.pee.prof.ProcuraProfIter;
import casoPratico2.plantraj.modprob.OperadorLigacao;
import casoPratico2.plantraj.modprob.ProblemaPlanTraj;

public class PlaneadorTrajecto { 
	
	public static void main(String[] args) {
		String localidadeInicial = "Loc-0";
		String localidadeFinal = "Loc-4";
		OperadorLigacao[] operadores = definirOperadores();
		ProblemaPlanTraj problema = new ProblemaPlanTraj(localidadeInicial,localidadeFinal,operadores);
//		ProcuraLarg procuraL = new ProcuraLarg();
//		ProcuraProf procuraP = new ProcuraProf();
//		ProcuraProfIter procuraI = new ProcuraProfIter(1);
		ProcuraCustoUnif procuraC = new ProcuraCustoUnif();
//		Solucao solucao = procuraI.resolver(problema,10);
//		Solucao solucao = procuraL.resolver(problema);
//		Solucao solucao = procuraP.resolver(problema);
		Solucao solucao = procuraC.resolver(problema);
		mostrarTrajecto(solucao);
		
	}
	private static OperadorLigacao[] definirOperadores() {
		 OperadorLigacao[] operadores = {
			new OperadorLigacao("Loc-0", "Loc-2", 25),
			new OperadorLigacao("Loc-0", "Loc-1", 5),
			new OperadorLigacao("Loc-1", "Loc-3", 12),
			new OperadorLigacao("Loc-1", "Loc-6", 5),
			new OperadorLigacao("Loc-2", "Loc-4", 30),
			new OperadorLigacao("Loc-3", "Loc-2", 10),
			new OperadorLigacao("Loc-3", "Loc-5", 5),
			new OperadorLigacao("Loc-4", "Loc-3", 2),
			new OperadorLigacao("Loc-5", "Loc-6", 8),
			new OperadorLigacao("Loc-5", "Loc-4", 10),
			new OperadorLigacao("Loc-6", "Loc-3", 15)};
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
/**
 * definir os operadores
 * definir o estado inicial e o estado final
 * procura em prof
 * 
 */

