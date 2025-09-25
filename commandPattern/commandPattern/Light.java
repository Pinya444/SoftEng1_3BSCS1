package commandPattern;

public class Light implements Device {
    @Override
    public String on() {
        return "Light is ON. Brightening the room.";
    }

    @Override
    public String off() {
        return "Light is OFF. Room is dark.";
    }

    @Override
    public String switchOn() {
        return "Light switched ON via wall switch.";
    }

    @Override
    public String switchOff() {
        return "Light switched OFF via wall switch.";
    }
}
