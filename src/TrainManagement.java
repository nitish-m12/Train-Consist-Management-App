/**
 * TrainManagement.java
 *
 * UC1 + UC2 + UC3 + UC4
 *
 * Description:
 * Demonstrates:
 * - Train initialization (UC1)
 * - ArrayList operations (UC2)
 * - HashSet uniqueness (UC3)
 * - LinkedList ordering & manipulation (UC4)
 *
 * Author: Nitish
 */

import java.util.*;

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

        Set<String> bogieIds = new HashSet<>();
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate

        System.out.println("Unique Bogie IDs: " + bogieIds);


        // ================= UC4 =================
        System.out.println("\n--- Maintaining Ordered Train Consist ---");

        // Step 1: Create LinkedList
        LinkedList<String> orderedTrain = new LinkedList<>();

        // Step 2: Add bogies in sequence
        orderedTrain.add("Engine");
        orderedTrain.add("Sleeper");
        orderedTrain.add("AC");
        orderedTrain.add("Cargo");
        orderedTrain.add("Guard");

        System.out.println("Initial Train: " + orderedTrain);

        // Step 3: Insert Pantry Car at position 2
        orderedTrain.add(2, "Pantry");
        System.out.println("After adding Pantry at position 2: " + orderedTrain);

        // Step 4: Remove first and last bogie
        orderedTrain.removeFirst();
        orderedTrain.removeLast();

        // Step 5: Final ordered train
        System.out.println("Final Train Consist: " + orderedTrain);

        System.out.println("\nSystem ready for further operations...");
    }
}