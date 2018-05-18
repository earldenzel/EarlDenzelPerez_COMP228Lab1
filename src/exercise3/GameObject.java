package exercise3;

/*
* In this exercise you will develop a Java application that allows the user to process game objects.
* Create a class named GameObject.
* A game object should contain information about object center, velocity, object state (alive or dead), and object rotation.
* The object center is defined by its x and y coordinates.
*
* Provide a constructor that allows the user to initialize game object information.
* Provide all getter methods.
* Provide a getGameObject method to return game object information in a nicely formatted string.
*
* Write a driver class to test the GameObject class.
* The driver class (main class) interacts with the user and calls GameObject methods to initialize or update the game object.
* Use the methods of JOptionPane class for providing input/output in the driver class.
*/

public class GameObject {
    //for this purpose, we are assuming GameObject to be a 2D object
    private Coordinate objectCenter; //has x and y coordinates
    private Coordinate velocity; //has x and y coordinates
    private boolean alive;
    private float rotation; //is an angle between 0 and 360f;

    //constructor
    public GameObject(Coordinate objectCenter, Coordinate velocity, boolean alive, float rotation) {
        this.objectCenter = objectCenter;
        this.velocity = velocity;
        this.alive = alive;
        this.rotation = ClampRotation(rotation); //rotation has to be clamped between 0 and 360f
    }

    //getters
    public Coordinate getObjectCenter() {
        return objectCenter;
    }

    public Coordinate getVelocity() {
        return velocity;
    }

    public boolean isAlive() {
        return alive;
    }

    public float getRotation() {
        return rotation;
    }

    //setters
    public void setObjectCenter(Coordinate objectCenter) {
        this.objectCenter = objectCenter;
    }

    public void setVelocity(Coordinate velocity) {
        this.velocity = velocity;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void setRotation(float rotation) {
        this.rotation = ClampRotation(rotation);
    }

    //return string equivalent of status
    public String getAlive(){
        return (isAlive() ? "Alive" : "Dead");
    }

    //returns string which describes game object
    public String getGameObject(){
        return String.format("Object Center: %s%nObject Velocity: %s%nObject Status: %s%nRotation: %.2f degrees",
                getObjectCenter().getCoordinates(),
                getVelocity().getCoordinates(),
                getAlive(),
                getRotation());
    }

    //helper class to clamp rotation between 0-360f
    public float ClampRotation(float angle){
        //sets the value of rotation between 0 and 360f
        while(angle > 360f || angle <0f){
            if (angle > 360f)
                angle -=360f;
            else if (angle <0f)
                angle += 360f;
        }
        return angle;
    }
}
