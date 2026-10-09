public class Aluguel {
	private int diasAlugada;
	private Fita fita;
  
	public Aluguel(Fita fita, int diasAlugada) {
		this.fita = fita;
		this.diasAlugada = diasAlugada;
	}
	
	public Fita getFita() {
		return fita;
	}
	
	public int getDiasAlugada() {
		return diasAlugada;
	}
	
	public double getValor() {
		return fita.getValor(diasAlugada);
	}
	
	public int getPontosDeAlugadorFrequente() {
		return fita.getPontos(diasAlugada);
	}
}
