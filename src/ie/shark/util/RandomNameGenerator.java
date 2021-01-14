package ie.shark.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RandomNameGenerator {
    List<String> seeds;
    public RandomNameGenerator() {
        // 20 * 18 = 380 random names
        seeds = Arrays.asList("Jerlene", "Lang", "Marcela", "Denny", "Emma", "Sharri", "Jasmin",
                "Camellia", "Costa", "Idella", "Madalyn", "Francina", "Lena", "Jaymie",
                "Francoise", "Sunny", "Lovie", "Gladys", "Delorse", "Jeraldine");
    }

    public String generate(int fullNameQuantity) {
        Collections.shuffle(seeds);
        StringBuilder fullName = new StringBuilder();
        for(int i = 0; i < fullNameQuantity ; i++) {
            fullName.append(seeds.get(i));
            fullName.append(" ");
        }
        return fullName.toString();
    }
}
