package pizzaria;

public abstract class PizzaStore {

    protected abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {

        Pizza pizza = createPizza(type);

        if (pizza == null) {
            throw new IllegalArgumentException(
                "Tipo de pizza desconhecido: " + type
            );
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}