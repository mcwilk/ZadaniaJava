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

    public static void main(String[] args) {
        Result res = fiboList(7);

        if (res.isListResult()) {
            List<Integer> listVal = res.getListValue();
            System.out.println("Lista wynikowa: " + listVal);
        } else {
            int intVal = res.getIntValue();
            System.out.println("Wartość całkowita: " + intVal);
        }
    }
}
