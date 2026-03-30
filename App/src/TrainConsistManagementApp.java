import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Welcome message
        System.out.println("=== Train Consist Management App - UC3 ===");

        // Step 2: Initialize HashSet for bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // Step 3: Add bogie IDs (including duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // Step 4: Display unique bogie IDs
        System.out.println("\nUnique bogie IDs in the train consist: " + bogieIDs);

        // Step 5: Inform about automatic deduplication
        System.out.println("\nNote: Duplicates were automatically ignored by HashSet.");
    }
}