package Medical_record;


import java.util.Scanner;

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
