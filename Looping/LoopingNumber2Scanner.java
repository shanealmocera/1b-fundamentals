import java.util.Scanner;
public class LoopingNumber2Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // not really needed, but included
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
            if (i % 20 == 0) System.out.println();
        }
        sc.close();
    }
}
