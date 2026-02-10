import java.util.Arrays;
import java.util.Scanner;

public class twodarrays {
   public static void main(String args[]) {
       Scanner in =new Scanner(System.in);
       System.out.println("enter the size of the array");
       int n=in.nextInt();
       int [][] arr=new int[n][];
       for(int row=0;row<n;row++){
           System.out.println("enter the coloumn size for row"+row);
           int col=in.nextInt();
           arr[row]=new int[col];
       }
       for(int row=0;row<arr.length;row++){
           for(int col=0;col<arr[row].length;col++){
               arr[row][col]=in.nextInt();
           }

           }
//       for(int row=0;row<arr.length;row++){
//           for(int col=0;col<arr[row].length;col++){
//               System.out.println(arr[row][col]+  " ");           }
//
//       }
//       System.out.println();
//       for(int row=0;row<arr.length;row++){
//           System.out.println(Arrays.toString(arr[row]));
//       }
       for(int []a:arr){
           System.out.println(Arrays.toString(a));
       }

    }
}
