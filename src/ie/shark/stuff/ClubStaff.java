package ie.shark.stuff;

import ie.shark.util.RandomNameGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClubStaff {
    private String type;
    private String name;

    public ClubStaff(String type, String name) {

        this.type = type;
        this.name = name;
    }

    public boolean isType(String type) {
        return  this.type.equalsIgnoreCase(type);
    }

    @Override
    public String toString() {
        return "ClubStaff{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    // It is responsible to factory one Club Staffs
    public static class ClubStaffFactory {
        public static ClubStaff random() {
            // Club Staff Types
            List<String> types = Arrays.asList("Receptionist", "Cleaner", "Caretaker", "Admin");
            // Shuffle it
            Collections.shuffle(types);
            // Generate one random name
            String name = new RandomNameGenerator().generate(2);
            // Use the first random name and type
            return new ClubStaff(types.get(0), name);
        };

        public static List<ClubStaff> random(int quantity) {
            List<ClubStaff> staffs = new ArrayList<>();
            for(int i = 0; i < quantity ; i++) {
                staffs.add(random());
            }
            return  staffs;
        };
    }
}
