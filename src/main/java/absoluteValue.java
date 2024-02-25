import java.util.ArrayList;
import java.util.List;

public class absoluteValue {
    public static float absolute(float x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }

    public static void main(String[] args) {
        int number = -10;
        float absVal = absolute(number);
        System.out.println("Absolute value for " + number + " is " + absVal);

        List<Float> floatList = new ArrayList<>();
        floatList.add(-10f);
        floatList.add(20f);
        floatList.add(1.254f);
        floatList.add(0f);
        floatList.add(-0.707f);

        for (Float v : floatList) {
            float absValOnListElem = absolute(v);
            System.out.println("Absolute value for " + v + " is " + absValOnListElem);
        }
    }
}
