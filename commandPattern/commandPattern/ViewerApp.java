package commandPattern;

public class ViewerApp {
    public static void main(String[] args){
        RemoteControl rc = new RemoteControl();

        // Control TV
        Device tv = (Device) new Tv();
        rc.setCommand(new PowerOn(tv));
        System.out.println(rc.pressButton());
        rc.setCommand(new PowerOff(tv));
        System.out.println(rc.pressButton());

        // Control Stereo
        Device stereo = (Device) new Stereo();
        rc.setCommand(new PowerOn(stereo));
        System.out.println(rc.pressButton());
        rc.setCommand(new PowerOff(stereo));
        System.out.println(rc.pressButton());

        // Control Light
        Device light = (Device) new Light();
        rc.setCommand(new PowerOn(light));
        System.out.println(rc.pressButton());
        rc.setCommand(new PowerOff(light));
        System.out.println(rc.pressButton());
    }
}
