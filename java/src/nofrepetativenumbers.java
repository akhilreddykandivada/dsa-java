import java.util.Scanner;

public class nofrepetativenumbers {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n,count=0,rem;
        n=in.nextInt();
        while(n>0){
        rem=n%10;
        if(rem==3){
            count++;
        }
        n=n/10;}
        System.out.println(count);
    }
}
