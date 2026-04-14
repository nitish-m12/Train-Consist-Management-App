/**
 * TrainManagement.java
 *
 * UC1 → UC5 Combined
 *
 * Description:
 * Demonstrates:
 * - Initialization (UC1)
 * - ArrayList operations (UC2)
 * - HashSet uniqueness (UC3)
 * - LinkedList ordering (UC4)
 * - LinkedHashSet (order + uniqueness) (UC5)
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

        LinkedList<String> orderedTrain = new LinkedList<>();

        orderedTrain.add("Engine");
        orderedTrain.add("Sleeper");
        orderedTrain.add("AC");
        orderedTrain.add("Cargo");
        orderedTrain.add("Guard");

        orderedTrain.add(2, "Pantry");

        orderedTrain.removeFirst();
        orderedTrain.removeLast();

        System.out.println("Final Train Consist: " + orderedTrain);


        // ================= UC5 =================
        System.out.println("\n--- LinkedHashSet: Order + Uniqueness ---");

        // Step 1: Create LinkedHashSet
        Set<String> formation = new LinkedHashSet<>();

        // Step 2: Add bogies
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // Step 3: Add duplicate intentionally
        formation.add("Sleeper"); // duplicate (ignored)

        // Step 4: Display final formation
        System.out.println("Final Train Formation: " + formation);

        System.out.println("\nSystem ready for further operations...");
    }
}