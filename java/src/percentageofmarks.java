import java.util.Scanner;

public class percentageofmarks {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of subjects:");
        int count = in.nextInt();

        float totalmarks = 0;
        float percentage;

        System.out.println("Enter the marks of " + count + " subjects:");
        for (int i = 0; i < count; i++) {
            totalmarks += in.nextFloat();
        }

        System.out.println("Total Marks: " + totalmarks);

        percentage = (totalmarks / (count * 100)) * 100;
        System.out.println("Percentage: " + percentage);

        switch ((int) percentage / 10) {
            case 10:
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
            default:
                System.out.println("Grade: D");
        }
    }
}
