import java.util.Scanner;

public class evenorodd {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        System.out.println(sum(num1,num2));

    }
    static int sum(int a,int b){
        int sum1=a+b;
        return sum1;
    }
}
