package Medical_record;

import java.util.Scanner;


class MedicalRecord {

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


public class OutPatientRecord extends MedicalRecord {
    private   String doctorName;
    private  int consultationFee;



    public OutPatientRecord() {
        super();
    }

    public void input_OutPatientRecord(){
        inputRecordDetails();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the doctor_name");
        doctorName= sc.next();
        System.out.println("enter the consultationFee");
        consultationFee=sc.nextInt();
    }




    public void displayRecoreds(){
        super.displayRecords_medicalrecords();
        System.out.println("doctorName    "+doctorName);
        System.out.println("consultationFee    " +consultationFee);
    }

    @Override
    public String toString() {
        return "OutPatientRecord{" +
                "doctorName='" + doctorName + '\'' +
                ", consultationFee=" + consultationFee +
                '}';
    }
}




 class InPatientRecord extends MedicalRecord {
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



public class MedicalRecord_main {
    public static void main(String[] args) {

     InPatientRecord inPatientRecord=     new InPatientRecord();

         OutPatientRecord outPatientRecord= new OutPatientRecord();




        Scanner sc  =new Scanner(System.in);
        System.out.println("please selecet patient types");
        System.out.println("1/inpatient");
        System.out.println("2/outpatient");
        int choose= sc.nextInt();

        if(1==choose){
            inPatientRecord.input_InPatientRecord();
            inPatientRecord.displayRecord();

        }
        else if(2==choose){
            outPatientRecord.input_OutPatientRecord();
            outPatientRecord.displayRecoreds();
        }
        else{
            System.out.println("valid input format");
        }



    }

}
