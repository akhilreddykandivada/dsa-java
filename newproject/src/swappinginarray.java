import java.util.Scanner;

public class swappinginarray {
    public static void main(String args[]) {
        int n;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the no of elelmts in array");
        n=in.nextInt();
        int []arr=new int[n];
        System.out.println("enter the arrau elements");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        change(arr,1,2);

    }
    static void change(int[] arr,int ind1,int ind2){
        int temp=arr[ind1];
        arr[ind1]=arr[ind2];
        arr[ind2]=temp;
    }
}
