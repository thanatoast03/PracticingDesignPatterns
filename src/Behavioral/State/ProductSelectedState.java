package Behavioral.State;

public class ProductSelectedState implements VendingMachineState {
    @Override
    public void handleState() {
        System.out.println("Selected product.");
    }
}
