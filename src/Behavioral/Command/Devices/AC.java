package Behavioral.Command.Devices;

public class AC extends ElectronicDevice {
    public AC() {
        super("AC");
    }

    @Override
    public void adjust() {
        System.out.println("Adjusted temperature of the A/C");
    }
}
