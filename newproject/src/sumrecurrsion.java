import java.util.Scanner;

public class sumrecurrsion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        int n=in.nextInt();

        add(n);

    }
    static int add(int n){
        int sum=0;
        if(n/10!=0){
            break;
            while(n>0){
                int rem=n%10;

                sum+=rem;
                n=n/10;

            }
            add(n);
        }
        return sum;
    }
}
