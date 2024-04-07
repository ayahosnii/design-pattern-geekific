package Bridge;

public class VegetarianPizza extends Pizza{
    @Override
    public void assemble() {
        System.out.println("Adding Sauce: " + sauce);
        System.out.println("Adding Topping: " + toppings);
        System.out.println("Adding Vegetables");
    }

    @Override
    public void qualityCheck()
    {
        System.out.println("Crust is " + crust);
    }
}
