package br.edu.unipe.apsii;

public class Estagiario extends Funcionario {

	protected double valorBolsaAuxilio;
	protected int cargaHorariaSemanal;

	public Estagiario(String nome, String matricula, double salarioBase, String dataAdmissao, double valorBolsaAuxilio,
			int cargaHorariaSemanal) {
		super(nome, matricula, salarioBase, dataAdmissao);
		this.valorBolsaAuxilio = valorBolsaAuxilio;
		this.cargaHorariaSemanal = cargaHorariaSemanal;
	}

	public double getValorBolsaAuxilio() {
		return valorBolsaAuxilio;
	}

	public int getCargaHorariaSemanal() {
		return cargaHorariaSemanal;
	}

	@Override
	public double calcularSalario() {
		return valorBolsaAuxilio;
	}

	@Override
	public double calcularDesconto() {
		return 0.0;
	}
	@Override
	public String toString() {
		return String.format("Estagiário: \n%s | %s | %.0f | %s | \nBolsa: %.0f | Carga horária: %d", 
				nome, matricula, salarioBase, dataAdimissao, valorBolsaAuxilio, cargaHorariaSemanal);
	}
}
