public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 9, 7, 0, 4, 2, 1};

        for (int i = 0; i < (numbers.length / 2); i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        for (int num: numbers) {
            System.out.println(num);
        }
    }
}
