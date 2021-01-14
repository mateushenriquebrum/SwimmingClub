package ie.shark.stuff;

import ie.shark.util.RandomAnimalNameGenerator;

import java.util.*;

public class SwimmingGroup {
    private final String name;
    private final int numOfSwimmers;
    private CoachStaff coach;

    public SwimmingGroup(String name, int numOfSwimmers){

        this.name = name;
        this.numOfSwimmers = numOfSwimmers;
    }

    public CoachStaff getCoach() {
        return coach;
    }

    public void setCoach(CoachStaff coach) {
        this.coach = coach;
    }

    @Override
    public String toString() {
        return "SwimmingGroup{" +
                "name='" + name + '\'' +
                ", numOfSwimmers=" + numOfSwimmers +
                ", coach=" + coach +
                '}';
    }

    // It is responsible to factory one Coaching Staffs
    public static class SwimmingGroupFactory {
        private static RandomAnimalNameGenerator RandomAnimalNameGenerator = new RandomAnimalNameGenerator();
        public static SwimmingGroup random() {
            // Get a name for this group
            String name = RandomAnimalNameGenerator.generate();
            // Get a quantity of swimmers
            int level = new Random().nextInt(3) + 1; // from 1 to 4
            // Use the first random name and type
            return new SwimmingGroup(name, level);
        };

        public static List<SwimmingGroup> random(int quantity) {
            List<SwimmingGroup> groups = new ArrayList<>();
            for(int i = 0; i < quantity ; i++) {
                groups.add(random());
            }
            return  groups;
        };
    }
}
