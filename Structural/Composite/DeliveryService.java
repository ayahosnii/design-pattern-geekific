package Composite;

public class DeliveryService {
    private Box box;

    public DeliveryService() {
        // Constructor implementation (if needed)
    }

    public void setupOrder(Box... boxes) {
        this.box = new CompositeBox(boxes);
    }

    public double calculatePrice() {
        return box.calculatePrice();
    }
}
