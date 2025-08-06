public class sum_of_even{
    public static void main(String[] args) {
        int n = 10, sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                continue;
            }
            sum += i;
        }
        System.out.println( sum);
    }
}
