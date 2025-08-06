import java.util.Scanner;

public class GradeSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the percentage: ");
        int percent = sc.nextInt();
        String grade;

        switch (percent / 10) {
            case 10:
            case 9:
            case 8:
                grade = "A";
                break;
            case 7:
                grade = "B";
                break;
            case 6:
            case 5:
                grade = "C";
                break;
            default:
                grade = "Fail";
        }

        System.out.println( grade);
    }
}
