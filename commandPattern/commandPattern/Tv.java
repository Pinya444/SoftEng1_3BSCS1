package commandPattern;

public class Tv implements Device {
    @Override
    public String on() {
        return "TV is ON. Showing channel 1.";
    }

    @Override
    public String off() {
        return "TV is OFF. Goodbye!";
    }

    @Override
    public String switchOn() {
        return "TV switched ON via switch.";
    }

    @Override
    public String switchOff() {
        return "TV switched OFF via switch.";
    }
}
