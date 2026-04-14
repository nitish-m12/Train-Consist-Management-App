/**
 * TrainManagement.java
 *
 * UC1 → UC7 Combined
 *
 * Description:
 * Demonstrates full Train Consist Management using:
 * - ArrayList, HashSet, LinkedList, LinkedHashSet, HashMap
 * - Custom Class (Bogie)
 * - Comparator sorting (based on capacity)
 *
 * Author: Nitish
 */

import java.util.*;

public class TrainManagement {

    // ================= UC7: Bogie Class =================
    static class Bogie {
        String name;
        int capacity;

        // Constructor
        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        // toString for printing
        @Override
        public String toString() {
            return name + " (" + capacity + ")";
        }
    }

    public static void main(String[] args) {

        // ================= UC1 =================
        System.out.println("=== Train Consist Management App ===");

        List<String> trainConsist = new ArrayList<>();
        System.out.println("Initial number of bogies: " + trainConsist.size());


        // ================= UC2 =================
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");
        trainConsist.remove("AC Chair");


        // ================= UC3 =================
        Set<String> bogieIds = new HashSet<>();
        bogieIds.add("BG101");
        bogieIds.add("BG101"); // duplicate ignored


        // ================= UC4 =================
        LinkedList<String> orderedTrain = new LinkedList<>();
        orderedTrain.add("Engine");
        orderedTrain.add("Sleeper");
        orderedTrain.add("Cargo");
        orderedTrain.add("Guard");


        // ================= UC5 =================
        Set<String> formation = new LinkedHashSet<>();
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Sleeper"); // duplicate ignored


        // ================= UC6 =================
        Map<String, Integer> bogieCapacity = new HashMap<>();
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 50);
        bogieCapacity.put("First Class", 24);


        // ================= UC7 =================
        System.out.println("\n--- Sorting Bogies by Capacity ---");

        // Step 1: Create list of Bogie objects
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("First Class", 24));

        // Step 2: Sort using Comparator (ascending order)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Step 3: Display sorted bogies
        System.out.println("Bogies sorted by capacity (ascending):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Step 4: Sort in descending order (important for viva)
        bogies.sort((a, b) -> b.capacity - a.capacity);

        System.out.println("\nBogies sorted by capacity (descending):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nSystem ready for further operations...");
    }
}