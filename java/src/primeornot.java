import java.util.Scanner;

public class primeornot {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        prime(n);
    }

    static void prime(int a) {
        if (a <= 1) {
            System.out.println("Not Prime");
            return;
        }

        int c = 2;
        while (c * c <= a) {
            if (a % c == 0) {
                System.out.println("Not Prime");
                return;
            }
            c++;
        }

        System.out.println("Prime");
    }
}
