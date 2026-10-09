mport javax.swing.JOptionPane;

public class JediAcademyJOptionPane {
    public static void main(String[] args) {
        int height = Integer.parseInt(JOptionPane.showInputDialog("Enter height (cm):"));
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age:"));
        char citizen = JOptionPane.showInputDialog("Enter citizenship code (C/N):").charAt(0);
        char recommendee = JOptionPane.showInputDialog("Enter recommendee code (R/N):").charAt(0);

        String result;
        if (recommendee == 'R') {
            result = "Applicant is ACCEPTED.";
        } else if (height >= 200 && age >= 21 && age <= 25 && citizen == 'C') {
            result = "Applicant is ACCEPTED.";
        } else {
            result = "Applicant is REJECTED.";
        }

        JOptionPane.showMessageDialog(null, result, "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
