package Bridge;

public abstract class Restaurant {
    protected Pizza pizza;

    protected Restaurant(Pizza pizza) {
        this.pizza = pizza;
    }

    abstract void addSauce();
    abstract void addTopping();
    abstract void makeCrust();

    public void deliver() {
        makeCrust();
        addSauce();
        addTopping();
    }
}
