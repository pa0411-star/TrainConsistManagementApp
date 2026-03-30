import java.util.LinkedList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // Step 1: Welcome message
        System.out.println("=== Train Consist Management App - UC4 ===");

        // Step 2: Initialize LinkedList for the train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Step 3: Add bogies to model a typical train sequence
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("\nInitial train consist: " + trainConsist);

        // Step 4: Insert Pantry Car at position 2 (indexing starts at 0)
        trainConsist.add(2, "Pantry Car");
        System.out.println("\nAfter adding Pantry Car at position 2: " + trainConsist);

        // Step 5: Remove first and last bogie
        String removedFirst = trainConsist.removeFirst();
        String removedLast = trainConsist.removeLast();

        System.out.println("\nRemoved first bogie: " + removedFirst);
        System.out.println("Removed last bogie: " + removedLast);

        // Step 6: Display final train consist
        System.out.println("\nFinal ordered train consist: " + trainConsist);
    }
}