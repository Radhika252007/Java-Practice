package Practice.Patterns;

public class alphabetPatterns {
    public static void main(String[] args) {
        int n = 5;
        char start = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
            }
            start += 1;
            System.out.println();

        }
    }
}
