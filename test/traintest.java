import java.util.*;
import java.util.stream.Collectors;
import java.util.regex.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Custom Exception
class InvalidCapacityException extends Exception {
    InvalidCapacityException(String message) {
        super(message);
    }
}

// Bogie Class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " -> Capacity: " + capacity;
    }
}

// Goods Bogie
class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

// ================= TEST CLASS =================
class TrainTest {

    private Map<String, List<Bogie>> groupBogies(List<Bogie> list) {
        return list.stream().collect(Collectors.groupingBy(b -> b.name));
    }

    private boolean validateTrainId(String input) {
        return Pattern.matches("TRN-\\d{4}", input);
    }

    private boolean validateCargoCode(String input) {
        return Pattern.matches("PET-[A-Z]{2}", input);
    }

    private boolean isSafetyCompliant(List<GoodsBogie> list) {
        return list.stream()
                .allMatch(b -> !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum"));
    }

    private List<Bogie> filterByLoop(List<Bogie> list, int t) {
        List<Bogie> res = new ArrayList<>();
        for (Bogie b : list) if (b.capacity > t) res.add(b);
        return res;
    }

    private List<Bogie> filterByStream(List<Bogie> list, int t) {
        return list.stream().filter(b -> b.capacity > t).collect(Collectors.toList());
    }

    @Test
    void testGrouping() throws Exception {
        List<Bogie> list = List.of(new Bogie("Sleeper",72), new Bogie("Sleeper",68));
        assertEquals(2, groupBogies(list).get("Sleeper").size());
    }

    @Test
    void testRegex() {
        assertTrue(validateTrainId("TRN-1234"));
        assertFalse(validateCargoCode("PET-ABC"));
    }

    @Test
    void testSafety() {
        List<GoodsBogie> list = List.of(new GoodsBogie("Cylindrical","Petroleum"));
        assertTrue(isSafetyCompliant(list));
    }

    @Test
    void testFilter() throws Exception {
        List<Bogie> list = List.of(new Bogie("Sleeper",72), new Bogie("AC",50));
        assertEquals(1, filterByStream(list,60).size());
    }
}

// ================= MAIN CLASS =================
public class TrainManagement {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<Bogie> list = new ArrayList<>();

        try {
            list.add(new Bogie("Sleeper",72));
            list.add(new Bogie("AC Chair",56));
            list.add(new Bogie("First Class",24));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        list.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nSorted:");
        list.forEach(System.out::println);

        int total = list.stream().map(b -> b.capacity).reduce(0, Integer::sum);
        System.out.println("\nTotal Seats: " + total);

        System.out.println("\nValidation:");
        System.out.println("TRN-1234 -> " + Pattern.matches("TRN-\\d{4}", "TRN-1234"));
        System.out.println("PET-AB -> " + Pattern.matches("PET-[A-Z]{2}", "PET-AB"));
    }
}