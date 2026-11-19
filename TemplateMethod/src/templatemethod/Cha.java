
package templatemethod;

public class Cha extends Bebida {

    @Override
    protected void adicionarIngrediente() {
        System.out.println("Colocando o cha em infusao...");
    }

    @Override
    protected void adicionarComplemento() {
        System.out.println("Adicionando limao ao cha...");
    }
}
