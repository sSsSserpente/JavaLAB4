public class Patient {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private String phone;
    private int medicalCardNumber;
    private String diagnosis;

    // Constructor
    public Patient(int id, String lastName, String firstName, String middleName, String address, String phone, int medicalCardNumber, String diagnosis) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.phone = phone;
        this.medicalCardNumber = medicalCardNumber;
        this.diagnosis = diagnosis;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getMedicalCardNumber() {
        return medicalCardNumber;
    }

    public void setMedicalCardNumber(int medicalCardNumber) {
        this.medicalCardNumber = medicalCardNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    // Additional method to print patient details
    public void printPatientDetails() {
        System.out.println("Patient ID: " + id);
        System.out.println("Name: " + lastName + " " + firstName + " " + middleName);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Medical Card Number: " + medicalCardNumber);
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("--------------------------");
    }
}

public class Hospital {
    public static void main(String[] args) {
        // Create an array of Patient objects
        Patient[] patients = new Patient[3];

        // Add patients to the array
        patients[0] = new Patient(1, "Bebra", "Vasya", "Big", "299 Khreshchatyk St", "123-456-7890", 1001, "Bolit noga");
        patients[1] = new Patient(2, "Big", "Nastya", "Bebra", "299 Khreshchatyk St, "