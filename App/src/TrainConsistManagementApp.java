import java.util.*;

class Bogie {
    private String name;
    private int capacity;

    // Constructor
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    // Display method
    public void display() {
        System.out.println(name + " - Capacity: " + capacity);
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Step 1: Create a List to store bogies
        List<Bogie> bogieList = new ArrayList<>();

        // Step 2: Add passenger bogies
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));

        // Step 3: Sort bogies by capacity using Comparator
        bogieList.sort(Comparator.comparingInt(Bogie::getCapacity));

        // Step 4: Display sorted bogies
        System.out.println("Bogies sorted by capacity (ascending):");
        for (Bogie b : bogieList) {
            b.display();
        }

        // Optional: Descending order
        bogieList.sort(Comparator.comparingInt(Bogie::getCapacity).reversed());

        System.out.println("\nBogies sorted by capacity (descending):");
        for (Bogie b : bogieList) {
            b.display();
        }
    }
}