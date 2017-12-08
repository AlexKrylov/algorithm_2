public class Main {
    public static void main(String[] args) {
        System.out.println(calculator(3, 20));
    }

    public static int calculator(int a, int b) {
        if (a == b) return 1;
        if (a > b) return 0;
        return calculator(a + 1, b) + (calculator(a * 2, b));
    }
}

