package assign1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NamesComputer {

    public float computeAverageLength(List<String> names) {
        if(names.isEmpty())
            return 0;

        float total = 0;

        for (String name : names) {
            total += name.length();
        }

        return total / names.size();
    }

    public Map<String, Integer> computeNamesStartingWithEachLetter(List<String> names) {
        Map<String, Integer> numberOfNamesWithEachLetter = new HashMap<>();

        for (String name : names) {
            String letter = name.substring(0,1);
            numberOfNamesWithEachLetter.putIfAbsent(letter, 0);
            numberOfNamesWithEachLetter.computeIfPresent(letter, (key, value) -> value + 1);
        }                                                         
        
        return numberOfNamesWithEachLetter;
    }

    public float functionalComputeAverageLength(List<String> names) {
        return names.size() == 0 ? 0 : (float) names.stream()
            .mapToDouble(String::length)
            .sum() / names.size();
    }

     public Map<String, Long> functionalComputeNamesStartingWithEachLetter(List<String> names) {
        return names.isEmpty() ? Map.of() :
            names.stream()
                .collect(Collectors.groupingBy(name -> name.substring(0, 1), Collectors.counting()));
    }
}