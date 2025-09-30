package Behavioral.Command;

import Behavioral.Command.Devices.AC;
import Behavioral.Command.Devices.Lights;
import Behavioral.Command.Devices.Speakers;
import Behavioral.Command.Devices.TV;

public class Controller {
    private AC ac;
    private Lights lights;
    private Speakers speakers;
    private TV tv;

    public Controller(AC ac, Lights lights, Speakers speakers, TV tv) { // I want to use Decorator pattern so bad here but that's not what I'm trying to learn right now
        this.ac = ac;
        this.lights = lights;
        this.speakers = speakers;
        this.tv = tv;
    }

    public void tvPowerButton() {
        tv.power();
    }

    public void tvChannelButton() {
        tv.adjust();
    }

    public void acPowerButton() {
        ac.power();
    }

    public void acTemperatureButton() {
        ac.adjust();
    }

    public void lightsPowerButton() {
        lights.power();
    }

    public void lightsBrightnessButton() {
        lights.adjust();
    }

    public void speakerPowerButton() {
        speakers.power();
    }

    public void speakerVolumeButton() {
        speakers.adjust();
    }
}
