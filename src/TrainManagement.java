/**
 * TrainManagement.java
 *
 * UC1: Initialize Train and Display Consist Summary
 *
 * Description:
 * This program simulates the initialization of a Train Consist Management App.
 * It demonstrates basic Java concepts like class structure, main method,
 * ArrayList usage, and console output.
 *
 * Author: Nitish
 */

import java.util.ArrayList;
import java.util.List;

public class TrainManagement {

    /**
     * Main method - Entry point of the Java application
     * JVM starts execution from here.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {

        // Step 1: Print welcome message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Initialize train consist using List (dynamic collection)
        // Using ArrayList to allow dynamic addition of bogies later
        List<String> trainConsist = new ArrayList<>();

        // Step 3: Display initial bogie count
        // Since no bogies are added yet, size should be 0
        System.out.println("Train initialized successfully.");
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // Step 4: Program continues (placeholder for future use cases)
        System.out.println("System ready for further operations...");
    }
}