package ie.shark.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RandomAnimalNameGenerator {
    List<String> adjective;
    List<String> noun;
    public RandomAnimalNameGenerator() {
        adjective = Arrays.asList("Red", "Blue", "Little", "Brilliant", "Shiny", "Fast", "Fluff", "Magic", "Happy");
        noun = Arrays.asList("Shark", "Fish", "Whale", "Star", "Shore", "Rock", "Boat", "Turtle", "Dolphin", "Sailor");
    }

    public String generate() {
        Collections.shuffle(adjective);
        Collections.shuffle(noun);
        return adjective.get(0)+" "+noun.get(0);
    }
}
