package br.edu.unipe.apsii;

public class FuncionarioCLT extends Funcionario {
	public double valetransporte;
	public double valerefeicao;

	public FuncionarioCLT(String nome, String matricula, double salariobase, String dataAdimissao,
			double valetransporte, double valerefeicao) {
		super(nome, matricula, salariobase, dataAdimissao);
		this.valetransporte = valetransporte;
		this.valerefeicao = valerefeicao;
	}

	@Override
	public double calcularSalario() {
		return super.calcularSalario() + valerefeicao + valetransporte;
	}

	@Override
	public double calcularDesconto() {
		return super.calcularDesconto() + 50.00;
	}
	@Override
	public String toString() {
		double liquido = calcularSalario() - calcularDesconto();
		return String.format("FuncionarioCLT: \n%s | %s | %.0f | %s | VT: %.0f | VA: %.0f", 
				nome, matricula, salarioBase, dataAdimissao, valetransporte, valerefeicao);
	}
}
