import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

class Result {
    private List<Integer> listValue;
    private int intValue;

    public Result(List<Integer> listValue) {
        this.listValue = listValue;
    }

    public Result(int intValue) {
        this.intValue = intValue;
    }

    public List<Integer> getListValue() {
        return listValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public boolean isListResult() {
        return listValue != null;
    }
}

public class fibonacci {
    public static Result fiboList(int n) {
        int i = 1;
        List<Integer> result = new ArrayList<>();

        if (n == 0){
            return new Result(result);
        } else if (n == 1) {
            result.add(1);
            return new Result(result);
        } else if (n == 2) {
            result.add(1);
            result.add(1);
            return new Result(result);
        } else if (n > 2) {
            result.add(1);
            result.add(1);
            while (i < (n - 1)) {
                result.add(result.get(i) + result.get(i-1));
                i++;
            }
        }
        return new Result(result.get(n - 1));
    }

    public static int fiboWzor(int n) {
        double res = (Math.pow(1 + Math.sqrt(5), n) - Math.pow(1 - Math.sqrt(5), n)) / (Math.pow(2, n) * Math.sqrt(5));
        return (int)res;
    }

    public static int fiboEasy(int n) {
        int a = 0;
        int b = 1;
        int temp;
        int i;

        for(i = 1; i < n+1; i++){
            // Using temporary variable to store a-value
            // temp = a;
            // a = b;
            // b = temp + b;

            // Using binary operators
            b = a ^ b;
            a = a ^ b;
            b = a ^ b;
            a = a + b;
        }
        return a;
    }

    public static void main(String[] args) {
        Result res = fiboList(5);

        if (res.isListResult()) {
            List<Integer> listVal = res.getListValue();
            System.out.println("Lista wynikowa: " + listVal);
        } else {
            int intVal = res.getIntValue();
            System.out.println("Wartość całkowita: " + intVal);
        }

        System.out.println(fiboWzor(7));

        System.out.println(fiboEasy(7));

    }
}
