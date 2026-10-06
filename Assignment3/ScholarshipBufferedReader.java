import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ScholarShipBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter NSAT score: ");
        int nsat = Integer.parseInt(br.readLine());

        System.out.print("Enter parents' monthly salary: ");
        double salary = Double.parseDouble(br.readLine());

        System.out.print("Enter entrance exam score: ");
        int exam = Integer.parseInt(br.readLine());

        // Decision logic
        if (salary > 10000 || nsat < 90 || exam < 85) {
            System.out.println("Application Status: REJECTED");
        } else if (salary <= 3500 && ((nsat + exam) / 2.0) >= 91) {
            System.out.println("Application Status: ACCEPTED");
        } else {
            System.out.println("Application Status: FOR FURTHER STUDY");
        }
    }
}
