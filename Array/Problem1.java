import java.util.Arrays; // ini-import natin ang Arrays class para magamit ang deepToString() method

public class CinemaSeatingChart { // ito ang main class ng program

    public static void main(String[] args) { // dito nagsisimula ang pagtakbo ng program

        // gumagawa dito ng 2D array para ilagay ang mga pangalan ng nakaupo sa cinema
        String[][] seats = {
                {"Alice", "Bob", "Charlie"}, // mga nakaupo sa unang row
                {"David", "Emma", "Frank"}   // mga nakaupo sa ikalawang row
        };

        // kinukuha at ipinapakita ang nasa Row 2, Column 3
        // tandaan na nagsisimula sa 0 ang bilang ng index kaya [1][2] si Frank
        System.out.println("Person in Row 2, Column 3: " + seats[1][2]);

        // pinapalitan dito si Bob ng "Vacant" para ipakita na wala nang nakaupo sa pwesto niya
        seats[0][1] = "Vacant";

        // nagpi-print ng heading bago ipakita ang updated seating arrangement
        System.out.println("Updated Seating Arrangement:");

        // pinapakita yung buong laman ng 2D array sa isang linya gamit ang deepToString()
        System.out.println(Arrays.deepToString(seats));

    } // katapusan ng main method

} // katapusan ng class
