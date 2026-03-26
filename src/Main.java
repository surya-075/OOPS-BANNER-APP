import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp - Final Version
 * * Evolution Summary:
 * UC1: Simple Print -> UC2-UC5: Array/Loop Refactoring ->
 * UC6-UC7: OOP & Encapsulation -> UC8: Collections (HashMap) & Scalability.
 * * @author YourName
 * @version 8.0
 */
public class OOPSBannerApp {

    // --- PART 1: Main Class & Data Structure ---

    // Using a Map to store Character patterns for efficient retrieval
    private static final Map<Character, String[]> characterMap = new HashMap<>();

    static {
        // Initialize the Map with ASCII patterns (7-line format, 9-char width)
        characterMap.put('O', new String[]{
                "  ***** ", " ** ** ", "** **", "** **", "** **", " ** ** ", "  ***** "
        });
        characterMap.put('P', new String[]{
                "******** ", "** ** ", "** ** ", "******** ", "** ", "** ", "** "
        });
        characterMap.put('S', new String[]{
                " ******* ", "** **", "** ", " ******* ", "       **", "** **", " ******* "
        });
    }

    // --- PART 2: Utility Static Methods ---

    /**
     * Renders any given string as a banner by looking up patterns in the Map.
     * Demonstrates Modularity and the use of StringBuilder.
     * @param message The string to be printed as a banner (e.g., "OOPS")
     */
    public static void displayBanner(String message) {
        System.out.println("--- UC8: Final Banner (HashMap & Collection Framework) ---");

        // Loop through each of the 7 rows of the banner
        for (int row = 0; row < 7; row++) {
            StringBuilder lineBuilder = new StringBuilder();

            // Nested loop: Iterate through each character in the input message
            for (char c : message.toUpperCase().toCharArray()) {
                String[] pattern = characterMap.get(c);

                if (pattern != null) {
                    lineBuilder.append(pattern[row]).append("  "); // Add spacing between letters
                }
            }
            System.out.println(lineBuilder.toString());
        }
        System.out.println();
    }

    // --- PART 3: Main Method ---

    public static void main(String[] args) {
        // Demonstrate the journey from UC1
        displayUC1();

        // Demonstrate the final modular UC8 solution
        // This can now print "OOPS", "SPOOP", "SOOP", or "POOP" easily!
        displayBanner("OOPS");
    }

    /** UC1: Original simple use case */
    public static void displayUC1() {
        System.out.println("--- UC1: Simple Print ---\nOOPS\n");
    }
}