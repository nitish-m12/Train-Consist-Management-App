/**
 * TrainManagement.java
 *
 * UC1 + UC2: Initialize Train and Add Passenger Bogies
 *
 * Description:
 * This program simulates a Train Consist Management App.
 * It demonstrates:
 * - Initialization of train consist
 * - Adding passenger bogies
 * - Removing bogies
 * - Checking existence of bogies
 * - Displaying list contents
 *
 * Concepts Used:
 * - ArrayList (Dynamic Collection)
 * - List Interface
 * - CRUD Operations (Create, Read, Delete)
 *
 * Author: Nitish
 */

import java.util.ArrayList;
import java.util.List;

public class TrainManagement {

    public static void main(String[] args) {

        // ================= UC1 =================
        System.out.println("=== Train Consist Management App ===");

        // Initialize empty train consist
        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train initialized successfully.");
        System.out.println("Initial number of bogies: " + trainConsist.size());


        // ================= UC2 =================
        System.out.println("\n--- Adding Passenger Bogies ---");

        // Step 1: Add passenger bogies
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        // Step 2: Display bogies after insertion
        System.out.println("Bogies after addition: " + trainConsist);

        // Step 3: Remove a bogie (AC Chair)
        trainConsist.remove("AC Chair");
        System.out.println("After removing AC Chair: " + trainConsist);

        // Step 4: Check if Sleeper exists
        if (trainConsist.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists in the train.");
        } else {
            System.out.println("Sleeper bogie not found.");
        }

        // Step 5: Final state of train consist
        System.out.println("Final train consist: " + trainConsist);

        System.out.println("\nSystem ready for further operations...");
    }
}