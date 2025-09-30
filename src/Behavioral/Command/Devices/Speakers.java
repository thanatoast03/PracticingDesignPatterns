package Behavioral.Command.Devices;

public class Speakers extends ElectronicDevice {
    public Speakers() {
        super("Speakers");
    }

    @Override
    public void adjust() {
        System.out.println("Adjusted volume of the speakers");
    }
}
