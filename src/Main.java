import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hours (0-23): ");
        int h = scanner.nextInt();
        System.out.print("Enter minutes (0-59): ");
        int m = scanner.nextInt();
        System.out.print("Enter seconds (0-59): ");
        int s = scanner.nextInt();

        s++; // Add one second

        if (s == 60) {
            s = 0;
            m++;
            if (m == 60) {
                m = 0;
                h++;
                if (h == 24) {
                    h = 0;
                }
            }
        }

        System.out.printf("Time one second later: %02d:%02d:%02d%n", h, m, s);

        scanner.close();
    }
}