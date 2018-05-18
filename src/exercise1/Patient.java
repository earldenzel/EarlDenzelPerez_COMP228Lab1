package exercise1;

/*
 * Create a class Patient that contains instance variables
 * for patient id, first name, last name, address, city, province, postal code.
 * Provide also multiple argument constructor to allow the initialization instance variables.
 * Provide all getter and setter methods.
 * Provide also a default constructor.
 * Provide a getPatientInfo method to return patient's data in a nicely formatted string.
 *
 * Write a driver class to test class Patient. Let the user enter patient's data.
 * Instantiate objects of class Patient and call its methods to display the results in a message dialog box.
 * Use the methods of JOptionPane class to provide input/output in the driver class.
 */

public class Patient {
    private int patientID;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String province;
    private String postalCode;

    public String getPatientInfo(){
        String message = String.format("Patient #%d:%n%s %s %n", getPatientID(), getFirstName(),getLastName());
        message += String.format("Address:%n\t%s%n\t%s, %s %s", getAddress(), getCity(), getProvince(), getPostalCode());
        return message;
    }

    //constructor, getter and setter procedurally created through IntelliJ
    public Patient(int patientID, String firstName, String lastName, String address, String city, String province, String postalCode) {
        this.patientID = patientID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }

    //default constructor
    public Patient(){
        this.patientID = 1;
        this.firstName = "Earl Denzel";
        this.lastName= "Perez";
        this.address = "941 Progress Ave.";
        this.city = "Scarborough";
        this.province = "ON";
        this.postalCode = "M1G 3T8";
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }



}


