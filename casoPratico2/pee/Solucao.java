package casoPratico2.pee;

import java.util.Iterator;

public interface Solucao extends Iterable<PassoSolucao> {
	@Override
	Iterator<PassoSolucao> iterator();
	int getDimensao();
	double getCusto();
}
