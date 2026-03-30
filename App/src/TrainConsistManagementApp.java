import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp
{

    public static void main(String[] args) {

        // Step 1: Welcome message
        System.out.println("=== Train Consist Management App - UC2 ===");

        // Step 2: Initialize Passenger Bogie List
        List<String> passengerBogies = new ArrayList<>();

        // Step 3: Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Step 4: Display list after insertion
        System.out.println("\nPassenger bogies after addition: " + passengerBogies);

        // Step 5: Remove a bogie (AC Chair)
        passengerBogies.remove("AC Chair");
        System.out.println("\nPassenger bogies after removing AC Chair: " + passengerBogies);

        // Step 6: Check if Sleeper bogie exists
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie is present in the train.");
        } else {
            System.out.println("\nSleeper bogie is NOT present in the train.");
        }

        // Step 7: Display final list state
        System.out.println("\nFinal passenger bogies: " + passengerBogies);
    }
}