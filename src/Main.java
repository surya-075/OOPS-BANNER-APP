/**
 * OOPSBannerApp
 * * UC1: Basic String Literal Print
 * UC2: Banner Format using String Concatenation (+)
 * UC3: Refactored Banner using String.join() for Memory Efficiency
 * * @author YourName
 * @version 3.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        displayUC1();
        displayUC2();
        displayUC3();
    }

    /**
     * UC1: Simple console output using a String Literal.
     */
    public static void displayUC1() {
        System.out.println("--- UC1: Simple Print ---");
        System.out.println("OOPS");
        System.out.println();
    }

    /**
     * UC2: Banner format using the + operator (Less efficient).
     */
    public static void displayUC2() {
        System.out.println("--- UC2: Banner (Concatenation +) ---");
        System.out.println("  ***** " + " " + "  ***** " + " " + "******** " + " " + " ******* ");
        System.out.println(" ** ** " + " " + " ** ** " + " " + "** **" + " " + "** **");
        System.out.println("** **" + " " + "** **" + " " + "** **" + " " + "** ");
        System.out.println("** **" + " " + "** **" + " " + "******** " + " " + " ******* ");
        System.out.println("** **" + " " + "** **" + " " + "** " + " " + "       **");
        System.out.println(" ** ** " + " " + " ** ** " + " " + "** " + " " + "** **");
        System.out.println("  ***** " + " " + "  ***** " + " " + "** " + " " + " ******* ");
        System.out.println();
    }

    /**
     * UC3: Refactored Banner using String.join().
     * This avoids creating multiple intermediate String objects in the Heap.
     */
    public static void displayUC3() {
        System.out.println("--- UC3: Banner (Refactored with String.join) ---");

        // Using String.join with an empty delimiter to merge the character segments
        String delim = "";

        System.out.println(String.join(delim, "  ***** ", "  ***** ", "******** ", "  ****** "));
        System.out.println(String.join(delim, " ** ** ", " ** ** ", "** **", " ** **"));
        System.out.println(String.join(delim, "** **", "** **", "** **", "** "));
        System.out.println(String.join(delim, "** **", "** **", "******** ", " ******* "));
        System.out.println(String.join(delim, "** **", "** **", "** ", "       **"));
        System.out.println(String.join(delim, " ** ** ", " ** ** ", "** ", "** **"));
        System.out.println(String.join(delim, "  ***** ", "  ***** ", "** ", " ******* "));
        System.out.println();
    }
}