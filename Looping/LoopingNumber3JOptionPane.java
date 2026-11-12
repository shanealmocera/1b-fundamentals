import javax.swing.JOptionPane;
public class LoopingNumber3JOptionPane {
    public static void main(String[] args) {
        double balance = 20000;

        while (true) {
            String input = JOptionPane.showInputDialog("Enter transaction (0 to stop):");
            double amount = Double.parseDouble(input);
            if (amount == 0) break;

            if (amount < 0 && balance + amount < 0) {
                JOptionPane.showMessageDialog(null, "INSUFFICIENT FUNDS!");
            } else {
                balance += amount;
                JOptionPane.showMessageDialog(null, "Balance: Php " + balance);
            }
        }
    }
}
