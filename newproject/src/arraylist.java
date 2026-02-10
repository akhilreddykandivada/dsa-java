import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        System.out.println("Enter the number of lists:");
        int n = in.nextInt();

        // Create rows
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }

        System.out.println("Enter number of elements and elements:");
        for (int i = 0; i < n; i++) {
            int m = in.nextInt();
            for (int j = 0; j < m; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        // Print output
        System.out.println("Output:");
        for (ArrayList<Integer> row : list) {
            System.out.println(row);
        }
    }
}
