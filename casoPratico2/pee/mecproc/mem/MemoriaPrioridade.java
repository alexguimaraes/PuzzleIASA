package casoPratico2.pee.mecproc.mem;

import java.util.Comparator;
import java.util.PriorityQueue;

import casoPratico2.pee.mecproc.No;

public class MemoriaPrioridade extends MemoriaProcura{

	public MemoriaPrioridade(Comparator<No> comparador) {
		super(new PriorityQueue<>(comparador));
	}

}
