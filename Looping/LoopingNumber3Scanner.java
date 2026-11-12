import java.util.Scanner;
public class LoopingNumber3Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 20000;

        while (true) {
            System.out.print("Enter transaction (0 to stop): ");
            double amount = sc.nextDouble();
            if (amount == 0) break;

            if (amount < 0 && balance + amount < 0) {
                System.out.println("INSUFFICIENT FUNDS!");
            } else {
                balance += amount;
                System.out.println("Balance: Php " + balance);
            }
        }
        sc.close();
    }
}
