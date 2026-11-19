
package templatemethod;

public abstract class Bebida {

    public final void prepararBebida() {
        ferverAgua();
        adicionarIngrediente();
        colocarNaXicara();
        adicionarComplemento();
    }

    private void ferverAgua() {
        System.out.println("Fervendo a agua...");
    }

    protected abstract void adicionarIngrediente();

    private void colocarNaXicara() {
        System.out.println("Colocando na xicara...");
    }

    protected abstract void adicionarComplemento();
}
