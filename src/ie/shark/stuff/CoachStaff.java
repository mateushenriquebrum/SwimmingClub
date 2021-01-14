package ie.shark.stuff;

import ie.shark.util.RandomNameGenerator;

import java.util.*;

public class CoachStaff {
    private final String type;
    private final String name;
    private final int level;

    public CoachStaff(String type, String name, int level) {

        this.type = type;
        this.name = name;
        this.level = level;
    }

    @Override
    public String toString() {
        return "CoachingStaff{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", level=" + level +
                '}';
    }

    // It is responsible to factory one Coaching Staffs
    public static class CoachStaffFactory {
        private static RandomNameGenerator RandomNameGenerator = new RandomNameGenerator();
        public static CoachStaff random() {
            // Club Staff Types
            List<String> types = Arrays.asList("Head Coach", "Assistant Coach", "Swim Teacher");
            // Shuffle it
            Collections.shuffle(types);
            // Generate one random name
            String name = RandomNameGenerator.generate(2);
            int level = new Random().nextInt(3) + 1; // from 1 to 4
            // Use the first random name and type
            return new CoachStaff(types.get(0), name, level);
        };

        public static List<CoachStaff> random(int quantity) {
            String name = RandomNameGenerator.generate(2);
            // Ensure one head coach
            List<CoachStaff> staffs = new ArrayList<>();
            staffs.add(new CoachStaff("Head Coach", name, 5));
            // Start in one because of header coach
            for(int i = 1; i < quantity ; i++) {
                staffs.add(random());
            }
            return  staffs;
        };
    }
}
