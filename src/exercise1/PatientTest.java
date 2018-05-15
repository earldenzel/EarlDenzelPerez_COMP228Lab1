package exercise1;

import javax.swing.*;

//Patient Driver Class
public class PatientTest {
    public static void main(String[] args) {
        //default variables
        JFrame frame = new JFrame();
        int patientID = 0;
        boolean askNumberAgain = true;

        //i want to force patient ID as a number
        while (askNumberAgain) {
            try {
                patientID = Integer.parseInt(JOptionPane.showInputDialog("Input patient ID"));
                askNumberAgain = false;
            } catch (Exception e){
                JOptionPane.showMessageDialog(frame,"Your patient ID should be a number. You will be asked to input patient ID again.");
                askNumberAgain = true;
            }
        }

        //ask patient details;
        String firstName = JOptionPane.showInputDialog("Please input first name");
        String lastName = JOptionPane.showInputDialog("Please input last name?");
        String firstLineAddress = JOptionPane.showInputDialog("Please input first line of your address");
        String cityName = JOptionPane.showInputDialog("Please input city");
        String provinceName = JOptionPane.showInputDialog("Please input province");
        String postalCode = JOptionPane.showInputDialog("Please input postal code");

        //create patient object via constructor
        Patient patient = new Patient(patientID,firstName,lastName,firstLineAddress,cityName,provinceName,postalCode);

        //show patient info as message
        JOptionPane.showMessageDialog(frame, patient.getPatientInfo());
    }
}

