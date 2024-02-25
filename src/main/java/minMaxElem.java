import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class minMaxElem {
    public static int funcMinMax(List<Integer> tab, String operation) {
        int res = tab.getFirst();

        for (Integer item: tab) {
            if (operation.equals("max")) {
                if (item > res) {
                    res = item;
                }
            } else if (operation.equals("min")) {
                if (item < res) {
                    res = item;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        List<Integer> tablica = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(100);
            tablica.add(randomNumber);
        }

        int resultMin = funcMinMax(tablica, "min");
        int resultMax = funcMinMax(tablica, "max");

        System.out.println("Tablica: " + tablica);
        System.out.println("min: " + resultMin);
        System.out.println("max: " + resultMax);
    }
}
