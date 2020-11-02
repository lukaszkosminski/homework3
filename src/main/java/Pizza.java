public class Pizza extends Hamburger {

    private PizzaSize pizzaSizze;
    private PizzaType pizzaType;
    private Integer quantityPizza;

    public PizzaSize getPizzaSizze() {
        return pizzaSizze;
    }

    public void setPizzaSizze(PizzaSize pizzaSizze) {
        this.pizzaSizze = pizzaSizze;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }

    public Integer getQuantityPizza() {
        return quantityPizza;
    }

    public void setQuantityPizza(Integer quantityPizza) {
        this.quantityPizza = quantityPizza;
    }
}
