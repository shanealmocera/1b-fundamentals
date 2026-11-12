import java.util.Arrays; // ini-import natin ang Arrays class para magamit ang deepToString() method
public class DailyTemperatureTracker { // pangunahing klase ng programa

    public static void main(String[] args) { // Main method kung saan nagsisimula ang program

        double[] temperatures = new double[5]; // gumagawa ng 1D double array na may 5 elements

        temperatures[0] = 32.5; // dito ise-set ang temperature para sa unang araw
        temperatures[1] = 34.0; // ito ang temperature setting para sa panaglawang araw
        temperatures[2] = 31.8; // itinatakda ang temperatura para sa ikatlong araw
        temperatures[3] = 33.2; // nilagay dito ang temperature para sa pang-apat na araw
        temperatures[4] = 35.1; // para ito sa temperature ng panglimang araw

        System.out.println("Daily Temperatures:"); // nagpi-print ng pamagat

        for (int i = 0; i < temperatures.length; i++) { // umiikot sa bawat elements ng array gamit ang for loop
            System.out.println("Day " + (i + 1) + ": " + temperatures[i]); // dito pinapakita yung araw at temperature
        }

        temperatures[2] = 32.0; // ina-update ang temperature ng ikatlong araw mula 31.8 papuntang 32.0

        System.out.println("\\\nUpdated Temperature for Day 3:"); // nagpi-print ng title para sa update

        System.out.println("Day 3: " + temperatures[2]); // pinapakita ang bagong temperatura ng ikatlong araw

    }

}
