public class PatternForLoop {
    public static void main(String[] args) {
        String[] pattern = {
            "1 1 R R R R",
            "1 1 R R",
            "1 R R R R",
            "1 1 R R",
            "1 1 R R"
        };

        for (String line : pattern) {
            System.out.println(line);
        }
    }
}
