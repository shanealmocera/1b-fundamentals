import javax.swing.JOptionPane;

public class PayrollJoption {
    public static void main(String[] args) {
        // Input dialogs
        double rate = Double.parseDouble(JOptionPane.showInputDialog("Enter hourly pay rate (Php):"));
        double hours = Double.parseDouble(JOptionPane.showInputDialog("Enter hours worked:"));

        // Compute gross pay
        double grossPay = rate * hours;
        double taxRate;

        if (grossPay <= 2000) {
            taxRate = 0.10;
        } else if (grossPay <= 4000) {
            taxRate = 0.12;
        } else if (grossPay <= 10000) {
            taxRate = 0.15;
        } else {
            taxRate = 0.20;
        }

        double withholdingTax = grossPay * taxRate;
        double netPay = grossPay - withholdingTax;

        // Output dialog
        String result = String.format(
                "--- Payroll Summary ---\nGross Pay: Php %.2f\nWithholding Tax (%.0f%%): Php %.2f\nNet Pay: Php %.2f",
                grossPay, taxRate * 100, withholdingTax, netPay
        );

        JOptionPane.showMessageDialog(null, result, "Payroll Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
