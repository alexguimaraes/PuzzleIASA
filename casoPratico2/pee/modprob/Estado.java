package casoPratico2.pee.modprob;

public abstract class Estado {

	public Estado() {
		
	}
	/**
	 * N�o � identifica��o por refer�ncia, � identifica��o por valor
	 * Os dois objectos s�o iguais t�m � valores diferentes
	 */
	public boolean equals(Object obj) {
		if(this.hashCode() == obj.hashCode()) return true;
		return false;
	}
	/**
	 * Hash code d� a identidade do objecto (refer�ncia ou valor)
	 * Classe String n�o usa refer�ncia, compara o conte�do
	 */
	public abstract int hashCode();
}
