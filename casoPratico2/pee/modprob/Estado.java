package casoPratico2.pee.modprob;

public abstract class Estado {

	public Estado() {
		
	}
	/**
	 * Não é identificação por referência, é identificação por valor
	 * Os dois objectos são iguais têm é valores diferentes
	 */
	public boolean equals(Object obj) {
		if(this.hashCode() == obj.hashCode()) return true;
		return false;
	}
	/**
	 * Hash code dá a identidade do objecto (referência ou valor)
	 * Classe String não usa referência, compara o conteúdo
	 */
	public abstract int hashCode();
}
