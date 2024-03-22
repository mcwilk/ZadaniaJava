public class fibonacci2 {
    public static void main(String[] args) {
        fibo(1);
        fibo(3);
        fibo(5);
        fibo(7);
    }

    public static void fibo(int n) {
        long n1 = 1;
        long n2 = 1;

        for (int i=3; i<=n; i++) {
            long temp = n1 + n2;
            n1 = n2;
            n2 = temp;
        }

        System.out.println(n2);
    }
}
