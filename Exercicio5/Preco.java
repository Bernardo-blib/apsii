public abstract class Preco {

	public abstract int getCodigo();

	public abstract double getValor(int diasAlugada);

	public int getPontos(int diasAlugada) {
		return 1;
	}
}
