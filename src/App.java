public class App {

    public static int fibonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return a;
    }

    public static void main(String[] args) throws Exception {
        int num = Integer.parseInt(args[0]);
        System.out.println(fibonacci(num));

    }
}