public class Invoker {
    ICommand command;

    public void setCommand(ICommand command){
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}
