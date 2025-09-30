package Behavioral.Command.Devices;

public class TV extends ElectronicDevice {
    public TV() {
        super("TV");
    }

    @Override
    public void adjust() {
        System.out.println("Changed channel on the TV");
    }
}
