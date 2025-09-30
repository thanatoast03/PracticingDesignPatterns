package Behavioral.Command;

import Behavioral.Command.Devices.AC;
import Behavioral.Command.Devices.Lights;
import Behavioral.Command.Devices.Speakers;
import Behavioral.Command.Devices.TV;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new AC(), new Lights(), new Speakers(), new TV());

        // Abstracted power buttons
        controller.acPowerButton();
        controller.lightsPowerButton();
        controller.speakerPowerButton();
        controller.tvPowerButton();

        // Abstracted adjusting particular aspects of each device
        controller.acTemperatureButton();
        controller.lightsBrightnessButton();
        controller.speakerVolumeButton();
        controller.tvChannelButton();
    }
}
