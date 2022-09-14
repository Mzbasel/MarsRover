public class Coordinates {

    public int xCoordinate;
    public int yCoordinate;
    public String direction;

    public Coordinates(int xCoordinate, int yCoordinate, String direction){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.direction = direction;
    }

    public Coordinates(int xCoordinate, int yCoordinate){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public void setXCoordinate(int newXCoordinate){
        this.xCoordinate = newXCoordinate;
    }

    public void setYCoordinate(int newYCoordinate){
        this.yCoordinate = newYCoordinate;
    }

    public void setDirection(String newDirection){
        this.direction = newDirection;
    }

    public String getDirection(){
        return String.valueOf(xCoordinate) + ":" + String.valueOf(yCoordinate) + ":" + direction;
    }

}
