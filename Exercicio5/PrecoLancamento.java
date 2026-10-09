public class PrecoLancamento extends Preco {

	@Override
	public int getCodigo() {
		return Fita.LANCAMENTO;
	}

	@Override
	public double getValor(int diasAlugada) {
		return diasAlugada * 3;
	}

	@Override
	public int getPontos(int diasAlugada) {
		return diasAlugada > 1 ? 2 : 1;
	}
}
