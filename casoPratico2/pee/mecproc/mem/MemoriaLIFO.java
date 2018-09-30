package casoPratico2.pee.mecproc.mem;

import java.util.Collections;
import java.util.LinkedList;

import casoPratico2.pee.mecproc.No;

public class MemoriaLIFO extends MemoriaProcura{
	/**
	 * Faz add no fim
	 */
	public MemoriaLIFO() {
		super(Collections.asLifoQueue(new LinkedList<No>()));
	}

}
