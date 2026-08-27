
public class Cd extends Produto implements InfoGerais{
    public int numFaixas;

    public int getNumFaixas() {
        return numFaixas;
    }

    public void setNumFaixas(int numFaixas) {
        this.numFaixas = numFaixas;
    }

	@Override
	public String exibirInformações() {
		return String.format("Nome: %s | Preço: %.2f | Numero de Faixas: %d", nome, preco, numFaixas);
	}
    
    
}


