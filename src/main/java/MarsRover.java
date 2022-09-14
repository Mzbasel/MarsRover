public class MarsRover {
    Grid grid;
    Invoker invoker;

    public MarsRover(Grid grid, Invoker invoker){
        this.grid = grid;
        this.invoker = invoker;
    }

    public String runCommands(String commands){
        String [] newCommands = commands.split("");
        for (int i = 0; i < newCommands.length; i++) {
            if(newCommands[i].equals("R")) {
                invoker.setCommand(new RotateRightCommand(grid));
                invoker.execute();
            }
        }
        return grid.getDirection();
    }


}
