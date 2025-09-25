package commandPattern;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public String pressButton() {
        if (command != null) {
            return command.execute();
        } else {
            return "No command set!";
        }
    }
}
