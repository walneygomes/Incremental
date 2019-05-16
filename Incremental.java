package Entidade;

public class Incremental {
	private static int count = 0;
	private int numero;
	private static Incremental instanciaClasse;

	private Incremental() {
		numero = ++count;
	}

	public static Incremental obterInstanciaNew() {
		if (instanciaClasse == null) {
			instanciaClasse = new Incremental();
		}
		return instanciaClasse;
	}

	public String toString() {
		return "Incremental" + this.numero;
	}

}
