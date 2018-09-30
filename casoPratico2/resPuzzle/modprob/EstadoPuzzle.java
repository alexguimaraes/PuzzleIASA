package casoPratico2.resPuzzle.modprob;

import casoPratico2.pee.modprob.Estado;
import puzzle.Puzzle;

public class EstadoPuzzle extends Estado {
	private Puzzle puzzle;

	public EstadoPuzzle(Puzzle puzzle) {
		this.puzzle = puzzle;
	}

	@Override
	public int hashCode() {
		return puzzle.hashCode();
	}

	public String toString() {
		return puzzle.toString();
	}

	public Puzzle getPuzzle() {
		return this.puzzle;
	}
}
