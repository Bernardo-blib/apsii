
 import java.util.Scanner;
 

public class Principal {
   public static void main (String[] args) {
	   Scanner entrada = new Scanner(System.in);
	   Livro livro = new Livro();
	   
       System.out.print("Digite o nome do livro: ");
       livro.SetNome(entrada.nextLine());
       
       System.out.print("Digite o preço do livro: ");
       livro.setPreco(entrada.nextDouble());
       
       entrada.nextLine();
       	   
	  System.out.print("Digite o Autor do livro: ");
	  livro.setAutor(entrada.nextLine());
	  
   
   Cd cd = new Cd();
   
   System.out.print("Digite o o nome do CD: ");
   cd.SetNome(entrada.nextLine());
   
   System.out.print("Digite o preço do CD: ");
   cd.setPreco(entrada.nextDouble());
    
   System.out.print("Digite o número de faxias do CD: ");
   cd.setNumFaixas(entrada.nextInt());
   
   System.out.print(cd.exibirInformações());
}
}