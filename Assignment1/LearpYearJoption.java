import javax.swing.JOptionPane;

public class LeapYearJOption {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a year:");
        int year = Integer.parseInt(input);

        String message;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            message = year + " is a Leap Year.";
        } else {
            message = year + " is NOT a Leap Year.";
        }
        JOptionPane.showMessageDialog(null, message);
    }
}
