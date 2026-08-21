package br.edu.unipe.apsii;

public class Gerente extends FuncionarioCLT {

	protected int tamanhoEquipe;
	protected double percentualBonus;

	public Gerente(String nome, String matricula, double salarioBase, String dataAdmissao, double valeTransporte,
			double valeAlimentacao, int tamanhoEquipe, double percentualBonus) {
		super(nome, matricula, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao);
		this.tamanhoEquipe = tamanhoEquipe;
		this.percentualBonus = percentualBonus * 100;
	}

	public int getTamanhoEquipe() {
		return tamanhoEquipe;
	}

	public double getPercentualBonus() {
		return percentualBonus ;
	}

	@Override
	public double calcularSalario() {
		return super.calcularSalario() + (salarioBase * percentualBonus / 100);
	
	}

	@Override
	public double calcularDesconto() {
		double desconto = super.calcularDesconto();
		if (tamanhoEquipe > 10) {
			desconto += 100.00;
		}
		return desconto;
	}

	@Override
	public String toString() {
		return String.format("Gerente: \n%s | %s | %.0f | %s | \nVT: %.0f | VA: %.0f | Equipe: %d | Bônus: %.0f%%",
				nome, matricula, salarioBase, dataAdimissao, valetransporte, valerefeicao, tamanhoEquipe,
				percentualBonus);
	}
}
