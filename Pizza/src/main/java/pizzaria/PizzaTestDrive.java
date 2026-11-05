package pizzaria;

public class PizzaTestDrive {

    public static void main(String[] args) {

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        System.out.println("=== PIZZARIA DE NOVA YORK ===");
        Pizza pizza = nyStore.orderPizza("queijo");
        System.out.println("Pedido: " + pizza.getName());

        System.out.println();

        System.out.println("=== PIZZARIA DE CHICAGO ===");
        pizza = chicagoStore.orderPizza("mariscos");
        System.out.println("Pedido: " + pizza.getName());
    }
}