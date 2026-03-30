import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // Step 1: Welcome message
        System.out.println("=== Train Consist Management App - UC5 ===");

        // Step 2: Initialize LinkedHashSet to store train bogies
        Set<String> trainFormation = new LinkedHashSet<>();

        // Step 3: Attach bogies (duplicates will be ignored)
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to attach a duplicate bogie
        boolean added = trainFormation.add("Sleeper"); // This will return false
        if (!added) {
            System.out.println("\nDuplicate bogie 'Sleeper' ignored.");
        }

        // Step 4: Display final formation
        System.out.println("\nFinal train formation in insertion order:");
        System.out.println(trainFormation);
    }
}