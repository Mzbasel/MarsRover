public class RotateRightCommand implements ICommand{

    Grid grid;
    public RotateRightCommand(Grid grid) {
        this.grid = grid;
    }

    @Override
    public void execute() {
        grid.rotateRight();
    }
}
