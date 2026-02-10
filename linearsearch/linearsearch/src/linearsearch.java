import java.util.Arrays;

public class linearsearch {
    public static void main(String[] args) {
        int[][]  arr={{1,2,3},{6,7,8},{11,77,89,67}
        };
        int target=67;
        System.out.println(Arrays.toString(search(arr,target)));

        }
        static int[] search(int [][] arr,int target) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[] {i,j};
                }
            }
    }

return new int[] {0};
}
}
