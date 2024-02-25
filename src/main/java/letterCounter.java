import java.util.HashMap;
import java.util.Map;

public class letterCounter {
    public static Map counter(String message, Character character) {
        Map<Character, Integer> result = new HashMap<>();

        for (char c: message.toCharArray()) {
            if (c == character) {
                result.put(character, result.getOrDefault(character, 0) + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String sentence = "It was a bright cold day in April, and the clocks were striking.";
        System.out.println(counter(sentence, 'a'));
    }
}
