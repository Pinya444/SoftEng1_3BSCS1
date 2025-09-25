package commandPattern;

public class Stereo implements Device {
    @Override
    public String on() {
        return "Stereo is ON. Playing default playlist.";
    }

    @Override
    public String off() {
        return "Stereo is OFF. Music stopped.";
    }

    @Override
    public String switchOn() {
        return "Stereo switched ON via switch. Volume at medium.";
    }

    @Override
    public String switchOff() {
        return "Stereo switched OFF via switch.";
    }
}
