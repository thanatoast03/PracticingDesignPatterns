package Behavioral.Command.Commands;

import Behavioral.Command.Devices.ElectronicDevice;

public class AdjustCommand implements Command {
    private ElectronicDevice device;
    public AdjustCommand(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.adjust();
    }
}
