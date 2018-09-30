package casoPratico2.pee.larg;

import casoPratico2.pee.Procura;
import casoPratico2.pee.mecproc.MecanismoProcura;
import casoPratico2.pee.mecproc.mem.MemoriaFIFO;
import casoPratico2.pee.mecproc.mem.MemoriaProcura;
import casoPratico2.pee.modprob.Problema;

public class ProcuraLarg extends MecanismoProcura<Problema> implements Procura{
	@Override
	protected MemoriaProcura iniciarMemoria(){
		return new MemoriaFIFO();
	}
}
