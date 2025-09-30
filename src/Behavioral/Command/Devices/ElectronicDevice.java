package Behavioral.Command.Devices;

abstract public class ElectronicDevice {
    private String name;
    private boolean on;

    public ElectronicDevice(String name) {
        this.name = name;
        this.on = false;
    }

    public String getName() {
        return name;
    }

    public boolean isOn() {
        return on;
    }

    abstract public void adjust(); // Adjusts some feature specific to each device

    public void power() { // Changes whether device is turned on or off
        if (isOn()) {
            on = false;
            System.out.println("Powered off the " + getName());
        }
        else {
            on = true;
            System.out.println("Powered on the " + getName());
        }
    }
}
