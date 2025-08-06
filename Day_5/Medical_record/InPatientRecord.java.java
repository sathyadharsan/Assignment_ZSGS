package Medical_record;

import java.util.Scanner;

public class InPatientRecord extends MedicalRecord {
    private int roomNumber;
    private int numberOfDaysAdmitted;
    private int roomCharges;



    public InPatientRecord() {
        super();
    }

    public void  input_InPatientRecord(){
      Scanner sc = new Scanner(System.in);
      inputRecordDetails();
        System.out.println("enter the roomNumber");
        roomNumber=sc.nextInt();
        System.out.println("enter the numberOfDaysAdmitted");
        numberOfDaysAdmitted=sc.nextInt();
        System.out.println("enter the roomCharges");
        roomCharges=sc.nextInt();
    }

    public int calculateTotalCharges() {
        return numberOfDaysAdmitted * roomCharges;
    }


    public void  displayRecord() {
        super.displayRecords_medicalrecords();
        System.out.println("roomNumber    " + roomNumber);
        System.out.println("numberOfDaysAdmitted    " + numberOfDaysAdmitted);
        System.out.println("roomCharges     " + roomCharges);
        System.out.println("calculateTotalCharges   " + calculateTotalCharges());

    }

    @Override
    public String toString() {
        return "InPatientRecord{" +
                "roomNumber=" + roomNumber +
                ", numberOfDaysAdmitted=" + numberOfDaysAdmitted +
                ", roomCharges=" + roomCharges +
                '}';
    }
}
