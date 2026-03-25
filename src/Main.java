/**
 * OOPSBannerApp
 * * UC1: Simple Print
 * UC2: Concatenation (+)
 * UC3: String.join()
 * UC4: Array & Loop (Manual population)
 * UC5: Inline Array Initialization (Concise & Readable)
 * * @author YourName
 * @version 5.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        displayUC1();
        displayUC2();
        displayUC3();
        displayUC4();
        displayUC5();
    }

    // ... (Methods for UC1, UC2, UC3, UC4 remain as defined previously) ...

    /**
     * UC5: Render OOPS as Banner using Inline Array Initialization.
     * Combines declaration and population into a single, concise statement.
     */
    public static void displayUC5() {
        System.out.println("--- UC5: Banner (Inline Array Initialization) ---");

        String d = ""; // Delimiter for joining segments

        // Combining declaration, initialization, and construction in one step
        String[] bannerLines = {
                String.join(d, "  ***** ", "  ***** ", "******** ", " ******* "),
                String.join(d, " ** ** ", " ** ** ", "** **", " ** **"),
                String.join(d, "** **", "** **", "** **", "** "),
                String.join(d, "** **", "** **", "******** ", " ******* "),
                String.join(d, "** **", "** **", "** ", "       **"),
                String.join(d, " ** ** ", " ** ** ", "** ", "** **"),
                String.join(d, "  ***** ", "  ***** ", "** ", " ******* ")
        };

        // Enhanced for-loop for clean traversal
        for (String line : bannerLines) {
            System.out.println(line);
        }
        System.out.println();
    }

    // UC1 - UC4 methods included below for completeness of the combined code logic
    public static void displayUC1() {
        System.out.println("--- UC1: Simple Print ---\nOOPS\n");
    }

    public static void displayUC2() {
        System.out.println("--- UC2: Banner (Concatenation +) ---");
        System.out.println("  ***** " + " " + "  ***** " + " " + "******** " + " " + " ******* ");
        System.out.println(" ** ** " + " " + " ** ** " + " " + "** **" + " " + "** **");
        System.out.println("** **" + " " + "** **" + " " + "** **" + " " + "** ");
        System.out.println("** **" + " " + "** **" + " " + "******** " + " " + " ******* ");
        System.out.println("** **" + " " + "** **" + " " + "** " + " " + "       **");
        System.out.println(" ** ** " + " " + " ** ** " + " " + "** " + " " + "** **");
        System