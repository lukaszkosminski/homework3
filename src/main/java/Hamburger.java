public class Hamburger {
    private HamburgerType hamburgerType;
    private HamburgerSize hamburgerSize;
    private Integer quantity;


    public HamburgerType getHamburgerType() {
        return hamburgerType;
    }

    public void setHamburgerType(HamburgerType hamburgerType) {
        this.hamburgerType = hamburgerType;
    }

    public HamburgerSize getHamburgerSize() {
        return hamburgerSize;
    }

    public void setHamburgerSize(HamburgerSize hamburgerSize) {
        this.hamburgerSize = hamburgerSize;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
