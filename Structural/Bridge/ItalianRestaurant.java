package Bridge;

public class ItalianRestaurant extends Restaurant {
    public ItalianRestaurant(Pizza pizza){
        super(pizza);
    }

    @Override
    public void addTopping() { pizza.setTopping(null); }

    @Override
    public void addSauce() { pizza.setSauce("Oil"); }

    @Override
    public void makeCrust() { pizza.setCrust("Thin"); }
}
