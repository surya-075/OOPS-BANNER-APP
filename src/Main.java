/**
 * OOPSBannerApp
 * * This class demonstrates the evolution of the application:
 * UC1: Simple console output.
 * UC2: Banner format using ASCII art (7 rows x 9 columns per character).
 * * @author YourName
 * @version 2.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // --- UC1: Simple Print ---
        System.out.println("Displaying UC1 Output:");
        System.out.println("OOPS");
        System.out.println("-------------------------------------------");

        // --- UC2: Banner Format (7x9 Grid) ---
        System.out.println("Displaying UC2 Output (Banner Format):");

        // Each line is constructed using String concatenation (+)
        // Logic: 9 chars for each letter + 1 space between letters

        // Row 1
        System.out.println("  ***** " + " " + "  ***** " + " " + "******** " + " " + " ******* ");

        // Row 2
        System.out.println(" ** ** " + " " + " ** ** " + " " + "** **" + " " + "** **");

        // Row 3
        System.out.println("** **" + " " + "** **" + " " + "** **" + " " + "** ");

        // Row 4
        System.out.println("** **" + " " + "** **" + " " + "******** " + " " + " ******* ");

        // Row 5
        System.out.println("** **" + " " + "** **" + " " + "** " + " " + "       **");

        // Row 6
        System.out.println(" ** ** " + " " + " ** ** " + " " + "** " + " " + "** **");

        // Row 7
        System.out.println("  ***** " + " " + "  ***** " + " " + "** " + " " + " ******* ");

        System.out.println("-------------------------------------------");
    }
}