/**
 * OOPSBannerApp
 * * Evolution of the App:
 * UC1-UC5: Evolution from literal strings to inline arrays.
 * UC6: Refactoring logic into static helper methods (DRY Principle).
 * * @author YourName
 * @version 6.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        // To keep the console clean, we will call the most advanced version
        displayUC6();
    }

    /**
     * UC6: Render OOPS using Static Helper Methods.
     * Demonstrates Method Abstraction and the DRY Principle.
     */
    public static void displayUC6() {
        System.out.println("--- UC6: Banner (Refactored with Helper Methods) ---");

        // Inline array initialization by calling helper methods
        // Notice 'getOPattern()' is called twice - Reusability in action!
        String[] bannerLines = {
                String.join("", getOPattern(0), getOPattern(0), getPPattern(0), getSPattern(0)),
                String.join("", getOPattern(1), getOPattern(1), getPPattern(1), getSPattern(1)),
                String.join("", getOPattern(2), getOPattern(2), getPPattern(2), getSPattern(2)),
                String.join("", getOPattern(3), getOPattern(3), getPPattern(3), getSPattern(3)),
                String.join("", getOPattern(4), getOPattern(4), getPPattern(4), getSPattern(4)),
                String.join("", getOPattern(5), getOPattern(5), getPPattern(5), getSPattern(5)),
                String.join("", getOPattern(6), getOPattern(6), getPPattern(6), getSPattern(6))
        };

        // Render the banner
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

// --- Helper Methods (Static Utility Functions