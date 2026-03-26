/**
 * OOPSBannerApp
 * * Evolution:
 * UC1-UC6: Evolution from simple literals to modular static methods.
 * UC7: Full OOP approach using Encapsulation, Static Inner Classes, and StringBuilder.
 * * @author YourName
 * @version 7.0
 */
public class OOPSBannerApp {

    // --- PART 1 & 2: Inner Static Class for Encapsulation ---

    /**
     * Inner static class to map a character to its banner pattern.
     * This demonstrates Encapsulation and Single Responsibility.
     */
    public static class CharacterPatternMap {
        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and pattern.
         * @param character The char literal
         * @param pattern Array of 7 strings representing the banner rows
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /** @return the character */
        public char getCharacter() { return character; }

        /**
         * @param row The row index (0-6)
         * @return The pattern string for that row
         */
        public String getRowPattern(int row) {
            return pattern[row];
        }
    }

    // --- PART 3: Outer Class Utility Methods ---

    /**
     * UC7 Logic: Displays the banner using an array of CharacterPatternMap objects.
     * Uses StringBuilder for memory efficiency during concatenation.
     */
    public static void displayUC7Banner() {
        System.out.println("--- UC7: Object-Oriented Banner (Inner Class & StringBuilder) ---");

        // Initialize Objects (State and Behavior encapsulated)
        CharacterPatternMap charO = new CharacterPatternMap('O', new String[]{
                "  ***** ", " ** ** ", "** **", "** **", "** **", " ** ** ", "  ***** "
        });

        CharacterPatternMap charP = new CharacterPatternMap('P', new String[]{
                "******** ", "** ** ", "** ** ", "******** ", "** ", "** ", "** "
        });

        CharacterPatternMap charS = new CharacterPatternMap('S', new String[]{
                " ******* ", "** **", "** ", " ******* ", "       **", "** **", " ******* "
        });

        // Array of objects representing the word "OOPS"
        CharacterPatternMap[] bannerArray = { charO, charO, charP, charS };

        // Render line by line
        for (int row = 0; row < 7; row++) {
            StringBuilder lineBuilder = new StringBuilder();
            for (CharacterPatternMap cp : bannerArray) {