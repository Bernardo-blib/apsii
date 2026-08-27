
public class Livro extends Produto implements InfoGerais{

	private String autor;
	public String getAutor() {
		return autor;
	}
     public void setAutor(String autor) {
    	 this.autor = autor;
     }
	 @Override
	 public String exibirInformações() {
		return null;
	 }
     
     
	}


