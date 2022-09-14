import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MarsRoverTest {
    @Test
    public void should_rotate_right_when_command_is_called(){
        Grid grid = new Grid();
        Invoker invoker = new Invoker();
        MarsRover marsRover = new MarsRover(grid, invoker);
        Assertions.assertEquals("0:0:E", marsRover.runCommands("R"));
    }

    @Test
    public void should_rotate_right_when_facing_east(){
        Grid grid = new Grid();
        Invoker invoker = new Invoker();
        MarsRover marsRover = new MarsRover(grid, invoker);
        Assertions.assertEquals("0:0:S", marsRover.runCommands("RR"));
    }

    @Test
    public void should_rotate_right_when_facing_south(){
        Grid grid = new Grid();
        Invoker invoker = new Invoker();
        MarsRover marsRover = new MarsRover(grid, invoker);
        Assertions.assertEquals("0:0:W", marsRover.runCommands("RRR"));
    }

    @Test
    public void should_rotate_right_when_facing_west(){
        Grid grid = new Grid();
        Invoker invoker = new Invoker();
        MarsRover marsRover = new MarsRover(grid, invoker);
        Assertions.assertEquals("0:0:N", marsRover.runCommands("RRRR"));
    }




}