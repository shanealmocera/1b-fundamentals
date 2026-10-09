import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class JediAcademyBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter height (cm): ");
        int height = Integer.parseInt(br.readLine());

        System.out.print("Enter age: ");
        int age = Integer.parseInt(br.readLine());

        System.out.print("Enter citizenship code (C/N): ");
        char citizen = br.readLine().charAt(0);

        System.out.print("Enter recommendee code (R/N): ");
        char recommendee = br.readLine().charAt(0);

        if (recommendee == 'R') {
            System.out.println("Applicant is ACCEPTED.");
        } else if (height >= 200 && age >= 21 && age <= 25 && citizen == 'C') {
            System.out.println("Applicant is ACCEPTED.");
        } else {
            System.out.println("Applicant is REJECTED.");
        }
    }
