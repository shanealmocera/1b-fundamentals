import java.util.Scanner;

public class JediAcademyScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height (cm): ");
        int height = sc.nextInt();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter citizenship code (C/N): ");
        char citizen = sc.next().charAt(0);

        System.out.print("Enter recommendee code (R/N): ");
        char recommendee = sc.next().charAt(0);

        if (recommendee == 'R') {
            System.out.println("Applicant is ACCEPTED.");
        } else if (height >= 200 && age >= 21 && age <= 25 && citizen == 'C') {
            System.out.println("Applicant is ACCEPTED.");
        } else {
            System.out.println("Applicant is REJECTED.");
        }

        sc.close();
    }
}
