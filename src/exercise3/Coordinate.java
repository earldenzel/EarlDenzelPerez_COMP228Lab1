package exercise3;

public class Coordinate {
    private float x;
    private float y;

    public Coordinate(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    //return nicely formatted string in the form of (x, y) with precision of 2 decimal places
    public String getCoordinates(){
        return String.format("(%.2f, %.2f)", getX(), getY());
    }

}
