package Bridge;

public abstract class Pizza {
    protected String Sauce;
    protected String toppings;
    protected String crust;
    
    public abstract void assemble();
    public abstract void qualityCheck();
}
