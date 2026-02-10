import java.util.Scanner;

public class fibonaci {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int i=0,p=1,count=2;
        while(count<=n){
            int temp=p;
            p=i+p;
            i=temp;
            count++;
        }
        System.out.println(p);
    }

}
