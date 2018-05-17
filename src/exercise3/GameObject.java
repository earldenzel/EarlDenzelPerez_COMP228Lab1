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
    //for this purpose, we are assuming gameobject to be a 2D object
    private Coordinate objectCenter; //has x and y coordinates
    private Coordinate velocity; //has x and y coordinates
    private boolean alive;
    private float rotation; //is an angle between 0 and 360f;

    public GameObject(Coordinate objectCenter, Coordinate velocity, boolean alive, float rotation) {
        this.objectCenter = objectCenter;
        this.velocity = velocity;
        this.alive = alive;

        //sets the value between 0 and 360f
        while(rotation > 360f || rotation <0f){
            if (rotation > 360f)
                rotation -=360f;
            else if (rotation <0f)
                rotation += 360f;
        }
        this.rotation = rotation;
    }

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
    
    public String GameObjectDetails(){
        String message = "";
        //message = String.format("Object Center: (%.2f.%.2f)%nObject Velocity: (%.2f.%.2f)
        return message;
    }



}
