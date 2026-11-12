import java.util.Scanner;
public class LoopingNumber1Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();
            if (num > highest) highest = num;
            if (num < lowest) lowest = num;
        }

        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
        sc.close();
    }
}
