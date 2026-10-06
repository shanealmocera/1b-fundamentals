import javax.swing.JOptionPane;

public class ScholarShipJOption {
    public static void main(String[] args) {
        int nsat = Integer.parseInt(JOptionPane.showInputDialog("Enter NSAT score:"));
        double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter parents' monthly salary:"));
        int exam = Integer.parseInt(JOptionPane.showInputDialog("Enter entrance exam score:"));

        String status;
        if (salary > 10000 || nsat < 90 || exam < 85) {
            status = "REJECTED";
        } else if (salary <= 3500 && ((nsat + exam) / 2.0) >= 91) {
            status = "ACCEPTED";
        } else {
            status = "FOR FURTHER STUDY";
        }
        JOptionPane.showMessageDialog(null, "Application Status: " + status);
    }
}
