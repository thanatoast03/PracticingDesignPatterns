package Behavioral.State;

public class Main {
    public static void main(String[] args) {
        VendingMachineContext context = new VendingMachineContext();
        context.setState(new ReadyState());
        context.request();

        context.setState(new ProductSelectedState());
        context.request();

        context.setState(new PaymentPendingState());
        context.request();

        context.setState(new OutOfStockState());
        context.request();
    }
}
