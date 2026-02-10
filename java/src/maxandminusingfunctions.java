import java.util.Scanner;

public class maxandminusingfunctions {
    public static void main(String args[]) {
        Scanner in= new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
       int d= max(a,b,c);
//        min(first,second,third);
        System.out.println(d);

    }
    static int max(int first,int second,int third){
        int temp=first;
        if(first<second){
            temp=second;
        }  if (temp<third) {
            temp=third;

        }
        return temp;
    }
}
