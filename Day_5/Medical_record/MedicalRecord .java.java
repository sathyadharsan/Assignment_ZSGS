package Medical_record;

//Day-5 Assignment Questions:*
//        1. Design a Java program to maintain hospital medical records.
//        Create a base class named MedicalRecord that includes common attributes:
//        --- recordId, patientName, dateOfVisit, and diagnosis.
//        --- inputRecordDetails() – to input common record information.
//        --- override displayRecord() – to display the common record details.
//        ?
//        Create a subclass InPatientRecord that extends MedicalRecord and adds:
//        --- roomNumber, numberOfDaysAdmitted, roomCharges.
//        --- calculateTotalCharges() – to compute and return total inpatient cost.
//        --- displayRecord() – to include all details, including total charges.
//        ?
//        Create another subclass OutPatientRecord that extends MedicalRecord and adds:
//        --- doctorName, consultationFee.
//        --- override displayRecord() – to include all outpatient-specific details.
//        Include all the necessary classes if its needed.

import java.util.Scanner;

public  class MedicalRecord {

    private  int  recordId;
    private  String patientName;
    private  String dateofVisit;
    private  String diagnosis;



    public MedicalRecord() {

    }

    public  void inputRecordDetails(){


       Scanner sc= new Scanner(System.in);
        System.out.println("enter the  recordId");
        recordId= sc.nextInt();
        System.out.println("enter the patientName");
        patientName=sc.next();
        System.out.println("enter the dataofvisit");
        dateofVisit=sc.next();
        System.out.println("enter the diagnosis ");
        diagnosis=sc.next();



    }

    public void   displayRecords_medicalrecords(){

        System.out.println("recordId    "+recordId);
        System.out.println("patientName    "+patientName);
        System.out.println("dateofVisit    "+dateofVisit);
        System.out.println("diagnosis    "+diagnosis);

    }

    @Override
    public String toString() {
        return "MedicalRecord{" +
                "recordId=" + recordId +
                ", patientName='" + patientName + '\'' +
                ", dateofVisit='" + dateofVisit + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}
