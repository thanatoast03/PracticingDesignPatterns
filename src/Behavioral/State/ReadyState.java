package Behavioral.State;

public class ReadyState implements VendingMachineState {
    @Override
    public void handleState() {
        System.out.println("Ready to select product.");
    }
}
