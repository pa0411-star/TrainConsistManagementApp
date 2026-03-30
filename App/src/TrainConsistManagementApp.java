import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Initialize Train Consist (Empty List)
        List<String> trainConsist = new ArrayList<>();

        // Step 3: Display Initial Bogie Count
        System.out.println("Initializing train consist...");
        System.out.println("Current number of bogies: " + trainConsist.size());

        // Step 4: Continue Program
        System.out.println("System ready for adding bogies.");
    }
}