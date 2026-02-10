import java.util.Scanner;

public class reversingofnumbers {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n,count=0,rem;
        n=in.nextInt();
        while(n>0){
            rem=n%10;
            count=count*10+rem;

            n=n/10;
        }
        System.out.println(count);}
    }
