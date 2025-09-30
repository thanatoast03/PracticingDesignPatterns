package Behavioral.Command.Devices;

public class Lights extends ElectronicDevice {
    public Lights() {
        super("Lights");
    }

    @Override
    public void adjust() {
        System.out.println("Adjusted brightness of the lights");
    }
}
