public class Pizza {

    private PizzaSize pizzaSizze;
    private PizzaType pizzaType;
    private Integer quantity;

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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
