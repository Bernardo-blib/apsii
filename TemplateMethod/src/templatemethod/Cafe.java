
package templatemethod;

public class Cafe extends Bebida {

    @Override
    protected void adicionarIngrediente() {
        System.out.println("Passando o cafe...");
    }

    @Override
    protected void adicionarComplemento() {
        System.out.println("Adicionando acucar ao cafe...");
    }
}
