package casoPratico2.pee.prof;

import casoPratico2.pee.Procura;
import casoPratico2.pee.mecproc.MecanismoProcura;
import casoPratico2.pee.mecproc.mem.MemoriaLIFO;
import casoPratico2.pee.mecproc.mem.MemoriaProcura;
import casoPratico2.pee.modprob.Problema;

public class ProcuraProf extends MecanismoProcura<Problema> implements Procura{

	@Override
	protected MemoriaProcura iniciarMemoria() {
		return new MemoriaLIFO();
	}

}
