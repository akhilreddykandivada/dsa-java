import java.util.Arrays;

public class maxandindex {
    public static void main(String[] args) {
        int[][] arr={
                {1,5,67,8},{23,67,89,907},{999567765,67,674567654}
        };

        System.out.println(Arrays.toString(maxandindex(arr)));
    }
    static int[] maxandindex(int[][] arr){
        int max= arr[0][0];
        int a=0,b=0;
        for( int i=0;i<arr.length;i++){

            for(int j=0;j<arr[i].length;j++){
                if(max<arr[i][j]){
                    max=arr[i][j];
                    a=i;
                    b=j;

                }
            }
    }
        return new int[] {max,a,b};

}}


