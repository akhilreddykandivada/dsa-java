import java.util.Arrays;
import java.util.Scanner;

public class reversearray {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int n=0;
        System.out.println("enter the array size");
        n=in.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        reverse(arr);}
    static void reverse(int[]arr){
        int start=0,end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;

        }
        System.out.println(Arrays.toString(arr));

}}
