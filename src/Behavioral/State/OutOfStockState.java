package Behavioral.State;

public class OutOfStockState implements VendingMachineState {
    @Override
    public void handleState() {
        System.out.println("The product is out of stock.");
    }
}
