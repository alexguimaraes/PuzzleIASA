package casoPratico2.resPuzzle.modprob;

import casoPratico2.pee.modprob.Estado;
import casoPratico2.pee.modprob.Operador;
import puzzle.Puzzle;
import puzzle.Puzzle.Movimento;

public class OperadorMovPosVazia implements Operador{

	private Movimento movimento;
	
	
	public OperadorMovPosVazia(Movimento movimento) {
		this.movimento = movimento;
	}

	@Override
	public Estado aplicar(Estado estado) {
		EstadoPuzzle e1 = (EstadoPuzzle) estado;
		Puzzle p1 = e1.getPuzzle();
		Puzzle p2 = p1.movimentar(movimento);
		if(p2 != null)
			return new EstadoPuzzle(p2);
		return null;
	}

	@Override
	public float custo(Estado estado, Estado estadoSuc) {
		return 1;
	}

}
