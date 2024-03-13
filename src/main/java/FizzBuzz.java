import java.util.ArrayList;

public class FizzBuzz {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Object> result = new ArrayList<>();

        for(int i = 1; i <= 100; i++) {
            nums.add(i);
        }

        for (Integer n: nums) {
            if (n % 3 == 0 && n % 5 == 0) {
                result.add("FizzBuzz");
            } else if (n % 3 == 0) {
                result.add("Fizz");
            } else if (n % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(n);
            }
        }

        System.out.println("Result:\n" + result);
    }

}
