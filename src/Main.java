/**
 * OOPSBannerApp
 * * UC1: Basic String Literal Print
 * UC2: Banner Format using String Concatenation (+)
 * UC3: Refactored Banner using String.join()
 * UC4: Modular Banner using String Array and Enhanced For-Loop
 * * @author YourName
 * @version 4.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        displayUC1();
        displayUC2();
        displayUC3();
        displayUC4();
    }

    /**
     * UC1: Simple console output.
     */
    public static void displayUC1() {
        System.out.println("--- UC1: Simple Print ---");
        System.out.println("OOPS");
        System.out.println();
    }

    /**
     * UC2: Banner format using String Concatenation (+).
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
     */
    public static void displayUC3() {
        System.out.println("--- UC3: Banner (String.join) ---");
        String d = "";
        System.out.println(String.join(d, "  ***** ", "  ***** ", "******** ", " ******* "));
        System.out.println(String.join(d, " ** **", " ** **", "** **", "** **"));
        System.out.println(String.join(d, "** **", "** **", "** **", "** "));
        System.out.println(String.join(d, "** **", "** **", "******** ", " ******* "));
        System.out.println(String.join(d, "** **", "** **", "** ", "       **"));
        System.out.println(String.join(d, " ** **", " ** **", "** ", "** **"));
        System.out.println(String.join(d, "  ***** ", "  ***** ", "** ", " ******* "));
        System.out.println();
    }

    /**
     * UC4: Optimized Banner using String Array and Enhanced For-Loop.
     * This eliminates repetitive println statements.
     */
    public static void displayUC4() {
        System.out.println("--- UC4: Banner (Array & Loop) ---");

        // 1. Create a String array to store all seven lines
        String[] bannerLines = new String[7];
        String d = ""; // Delimiter

        // 2. Populate the array using String.join()
        bannerLines[0] = String.join(d, "  *****