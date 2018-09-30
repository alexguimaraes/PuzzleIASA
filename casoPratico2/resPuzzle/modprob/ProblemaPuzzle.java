package casoPratico2.resPuzzle.modprob;

import casoPratico2.pee.modprob.Estado;
import casoPratico2.pee.modprob.Problema;
import casoPratico2.pee.modprob.ProblemaHeur;
import puzzle.Puzzle;

public class ProblemaPuzzle extends ProblemaHeur{
	private EstadoPuzzle estadoFinal;
	
	public ProblemaPuzzle(Puzzle puzzleIni, Puzzle puzzleFin, OperadorMovPosVazia[] operadores) {
		super(new EstadoPuzzle(puzzleIni), operadores);
		estadoFinal = new EstadoPuzzle(puzzleFin);	
	}

	@Override
	public boolean objectivo(Estado estado) {
		return estado.equals(estadoFinal);
	}

	@Override
	public double heuristica(Estado estado) {
		EstadoPuzzle estadoPuzzle = (EstadoPuzzle) estado;
		Puzzle puzzle = estadoPuzzle.getPuzzle();
		Puzzle puzzleFinal = estadoFinal.getPuzzle();
//		return puzzle.distManhattan(puzzleFinal);
		return puzzle.numPecasForaLugar(puzzleFinal);
	}

}
