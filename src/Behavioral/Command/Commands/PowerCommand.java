package Behavioral.Command.Commands;

import Behavioral.Command.Devices.ElectronicDevice;

public class PowerCommand implements Command {
    private ElectronicDevice device;

    public PowerCommand(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.power();
    }
}
