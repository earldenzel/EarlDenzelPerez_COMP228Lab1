package exercise3;

import javax.swing.*;

public class GameObjectTest {
    public static void main(String[] args) {
        //Let user input and initialize game object details
        Coordinate center = modifyCenter(); //set center
        Coordinate velocity = modifyVelocity(); //set velocity
        boolean alive = modifyStatus(); //set status
        float rotation = modifyRotation(); //set rotation

        //create game object
        GameObject gameObject = new GameObject(center, velocity, alive, rotation);

        //game object  menu
        String[] buttons = { "Move Center", "Change Velocity", "Update Status", "Set Rotation", "Quit" };
        int rc = 0;
        while (rc != 4){
            rc = JOptionPane.showOptionDialog(
                    null, gameObject.getGameObject(),
                    "Game Object Status",
                    JOptionPane.DEFAULT_OPTION, 3, null, buttons, buttons[4]);
            switch (rc){
                case 0: //move center
                    gameObject.setObjectCenter(modifyCenter());
                    break;
                case 1: //change velocity
                    gameObject.setVelocity(modifyVelocity());
                    break;
                case 2: //change object status
                    gameObject.setAlive(modifyStatus());
                    break;
                case 3:
                    gameObject.setRotation(modifyRotation());
                default: //quit
                    break;
            }
        }
    }

    //window class for modifying center
    public static Coordinate modifyCenter(){
        float xCenter = Float.parseFloat(JOptionPane.showInputDialog("Please input game object's x-position"));
        float yCenter = Float.parseFloat(JOptionPane.showInputDialog("Please input game object's y-position"));
        return new Coordinate (xCenter, yCenter);
    }

    //window class for modifying velocity
    public static Coordinate modifyVelocity(){
        float xVelocity = Float.parseFloat(JOptionPane.showInputDialog("Please input game object's velocity in the x-axis"));
        float yVelocity = Float.parseFloat(JOptionPane.showInputDialog("Please input game object's velocity in the y-axis"));
        return new Coordinate(xVelocity, yVelocity);
    }

    //window class for modifying object status
    public static boolean modifyStatus(){
        int selectedOption = JOptionPane.showConfirmDialog(null,
                "Is the object alive?",
                "Enter game object details",
                JOptionPane.YES_NO_OPTION);
        return (selectedOption == JOptionPane.YES_OPTION);
    }

    //window class for modifying object rotation
    public static float modifyRotation(){
        return Float.parseFloat(JOptionPane.showInputDialog("Please input game object's rotation (between 0 and 360 degrees)"));
    }

}
