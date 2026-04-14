/**
 * TrainManagement.java
 *
 * UC1 + UC2 + UC3: Train Initialization, Passenger Bogies, Unique Bogie IDs
 *
 * Description:
 * This program simulates a Train Consist Management App.
 * It demonstrates:
 * - Train initialization
 * - Adding/removing passenger bogies (ArrayList)
 * - Ensuring unique bogie IDs (HashSet)
 *
 * Concepts Used:
 * - List (ArrayList)
 * - Set (HashSet)
 * - CRUD operations
 * - Uniqueness enforcement
 *
 * Author: Nitish
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TrainManagement {

    public static void main(String[] args) {

        // ================= UC1 =================
        System.out.println("=== Train Consist Management App ===");

        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train initialized successfully.");
        System.out.println("Initial number of bogies: " + trainConsist.size());


        // ================= UC2 =================
        System.out.println("\n--- Adding Passenger Bogies ---");

        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        System.out.println("Bogies after addition: " + trainConsist);

        trainConsist.remove("AC Chair");
        System.out.println("After removing AC Chair: " + trainConsist);

        if (trainConsist.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists in the train.");
        }

        System.out.println("Final train consist: " + trainConsist);


        // ================= UC3 =================
        System.out.println("\n--- Tracking Unique Bogie IDs ---");

        // Step 1: Create HashSet for unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Step 2: Add bogie IDs (with duplicates intentionally)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Step 3: Display unique bogie IDs
        System.out.println("Unique Bogie IDs: " + bogieIds);

        System.out.println("\nSystem ready for further operations...");
    }
}