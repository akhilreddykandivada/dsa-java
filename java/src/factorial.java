import java.util.Scanner;

public class factorial {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(fact(n));

    }

    static int fact(int n) {
        int fact1=1;
//        for(int i=1;i<=n;i++){
//             fact1*=i;
//        }
        return n*fact1;
    }
}
