package Exercicio01;

public class Aniversariante {
	private String nome;
	private DataAniversario dataAniversario;

	public Aniversariante (String nome, int dia, int mes) {
		this.nome = nome;
		this.dataAniversario = dataAniversario(dia, mes);
	}
	public Aniversariante (String nome, DataAniversario dataAniversario) {
		this.nome = nome;
		this.dataAniversario = dataAniversario;
	}
	//gets e sets...
	public boolean equalsAniversariante(Object outroAniversariante) {
		Aniversariante a = outroAniversariante;
		if (this.nome.equals(a.nome) &&
				this.dataAniversario.equals(a.dataAniversario))
		{
			return true;
		}
		return false;
	}
}
