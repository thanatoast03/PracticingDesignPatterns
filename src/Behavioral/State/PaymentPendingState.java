package Behavioral.State;

public class PaymentPendingState implements VendingMachineState {
    @Override
    public void handleState() {
        System.out.println("Waiting for payment.");
    }
}
