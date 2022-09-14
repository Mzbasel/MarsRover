import java.util.Map;

public class Grid {

    private Coordinates currentCoordinates;
    private enum rotate{
        N("E", "W"),
        W("N", "S"),
        E("S", "N"),
        S("W", "E");

        rotate(){}
    }

    public Grid(){
        currentCoordinates = new Coordinates(0,0,"N");
    }
    public void rotateRight() {
        if(currentCoordinates.direction.equals("E")) {
            currentCoordinates.setDirection("S");
            return;
        }
        if(currentCoordinates.direction.equals("N")) {
            currentCoordinates.setDirection("E");
            return;
        }
        if(currentCoordinates.direction.equals("S")) {
            currentCoordinates.setDirection("W");
            return;
        }
        if(currentCoordinates.direction.equals("W")) {
            currentCoordinates.setDirection("N");
            return;
        }
    }

    public String getDirection(){
        return currentCoordinates.getDirection();
    }

}
