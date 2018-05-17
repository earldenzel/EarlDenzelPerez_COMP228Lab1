package exercise3;

import javax.swing.*;

public class GameObjectTest {
    public static void main(String[] args) {
        //Let user input and initialize game object details
        //set center
        float xCenter = Float.parseFloat(JOptionPane.showInputDialog("Please input game object's x-position"));
        float yCenter = Float.parseFloat(JOptionPane.showInputDialog("Please input game object's y-position"));
        Coordinate center = new Coordinate (xCenter, yCenter);

        //set velocity
        float xVelocity = Float.parseFloat(JOptionPane.showInputDialog("Please input game object's velocity in the x-axis"));
        float yVelocity = Float.parseFloat(JOptionPane.showInputDialog("Please input game object's velocity in the y-axis"));
        Coordinate velocity = new Coordinate(xVelocity, yVelocity);

        //is object alive or dead?
        int selectedOption = JOptionPane.showConfirmDialog(null,
                "Is the object alive?",
                "Enter game object details",
                JOptionPane.YES_NO_OPTION);
        boolean alive = (selectedOption == JOptionPane.YES_OPTION);

        //set rotation
        float rotation = Float.parseFloat(JOptionPane.showInputDialog("Please input game object's rotation (between 0 ad 360 degrees)"));

        //create game object
        GameObject gameObject = new GameObject(center, velocity, alive, rotation);

    }
}
