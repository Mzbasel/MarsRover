public class MoveCommand implements ICommand{

    Grid grid;

    public MoveCommand(Grid grid) {
        this.grid = grid;
    }

    @Override
    public void execute() {
    }
}
