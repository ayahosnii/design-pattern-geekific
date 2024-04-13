package Composite;

public class Main {
    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService();
        deliveryService.setupOrder(
            new CompositeBox(
                new VideoGame("1", 100)
            ),
            new CompositeBox(
                new CompositeBox(
                    new VideoGame("1", 100)
                )
            ),
            new VideoGame("4", 400),
            new VideoGame("5", 500)
        );  
        
        deliveryService.calculatePrice();
    }
}
