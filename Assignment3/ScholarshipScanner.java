import java.util.Scanner;

public class ScholarShipScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter NSAT score: ");
        int nsat = sc.nextInt();

        System.out.print("Enter parents' monthly salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter entrance exam score: ");
        int exam = sc.nextInt();

        if (salary > 10000 || nsat < 90 || exam < 85) {
            System.out.println("Application Status: REJECTED");
        } else if (salary <= 3500 && ((nsat + exam) / 2.0) >= 91) {
            System.out.println("Application Status: ACCEPTED");
        } else {
            System.out.println("Application Status: FOR FURTHER STUDY");
        }
    }
}
