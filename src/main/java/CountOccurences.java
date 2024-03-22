import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountOccurences {
    // int[] numbers = new int[] {1,2,3,2,5,3}
    public static void main(String[] args) {
        int[] numbers = new int[] {1,2,3,2,5,3};
        countNumbers(numbers);
    }

    public static void countNumbers(int[] numbers) {
        Map<Integer, Integer> occurences = new HashMap<>();

        for (int i=0; i<numbers.length; i++) {
            if (occurences.containsKey(numbers[i])) {
                Integer value = occurences.get(numbers[i]);
                occurences.put(numbers[i], value+1);
            } else {
                occurences.put(numbers[i], 1);
            }
        }

        for (Integer key: occurences.keySet()) {
            System.out.println("Number " + key + " occurred " + occurences.get(key) + " number of times");
        }
    }
}
