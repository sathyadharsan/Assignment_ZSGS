import java.util.Scanner;

public class Grade_If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter  the percentage: ");
        int percent = sc.nextInt();

        if (percent >= 85 && percent <= 100)
            System.out.println("grade: A");
        else if (percent >= 70)
            System.out.println("grade: B");
        else if (percent >= 50)
            System.out.println("grade: C");
        else
            System.out.println("fail");
    }
}
