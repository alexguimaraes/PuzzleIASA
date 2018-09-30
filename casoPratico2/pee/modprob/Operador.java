package casoPratico2.pee.modprob;

public interface Operador {
	Estado aplicar(Estado estado);
	float custo(Estado estado, Estado estadoSuc);
}
