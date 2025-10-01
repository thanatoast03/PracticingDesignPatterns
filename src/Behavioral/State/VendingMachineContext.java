package Behavioral.State;

public class VendingMachineContext {
    private VendingMachineState currentState = new ReadyState();

    public void setState(VendingMachineState newState) {
        currentState = newState;
    }

    public void request() {
        currentState.handleState();
    }
}
