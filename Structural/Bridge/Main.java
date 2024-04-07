package Bridge;

public class Main {
    public static void main(String[] args) {
        // Create an American style pizza
        Pizza americanPizza = new VegetarianPizza();
        Restaurant americanRestaurant = new AmericanRestaurant(americanPizza);

        // Prepare the American style pizza
        americanRestaurant.addTopping();
        americanRestaurant.addSauce();
        americanRestaurant.makeCrust();

        // Assemble and check the quality of the American style pizza
        americanPizza.assemble();
        americanPizza.qualityCheck();

        // Create an Italian style pizza
        Pizza italianPizza = new ItalianPizza();
        Restaurant italianRestaurant = new ItalianRestaurant(italianPizza);

        // Prepare the Italian style pizza
        italianRestaurant.addTopping();
        italianRestaurant.addSauce();
        italianRestaurant.makeCrust();

        // Assemble and check the quality of the Italian style pizza
        italianPizza.assemble();
        italianPizza.qualityCheck();
    }
}
