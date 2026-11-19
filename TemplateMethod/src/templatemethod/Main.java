
package templatemethod;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== PREPARANDO CAFE ===");
        Bebida cafe = new Cafe();
        cafe.prepararBebida();

        System.out.println();

        System.out.println("=== PREPARANDO CHA ===");
        Bebida cha = new Cha();
        cha.prepararBebida();
    }
}
