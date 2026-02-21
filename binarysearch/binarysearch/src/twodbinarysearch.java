import java.util.Arrays;

public class twodbinarysearch {

    public static void main(String[] args) {

        int [][]arr={
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25},
        };

        int target=24;

        System.out.println(Arrays.toString(search(arr,target)));
    }

    static int[] bs(int[][]arr,int r,int cs,int ce,int target){

        while(cs<=ce){

            int mid=cs+(ce-cs)/2;

            if(arr[r][mid]==target)
                return new int[]{r,mid};

            else if(target>arr[r][mid])
                cs=mid+1;

            else
                ce=mid-1;
        }

        return new int[]{-1,-1};
    }


    static int[] search(int[][]arr,int target){

        int rs=0;
        int re=arr.length-1;

        int col=arr[0].length;

        int mcol=col/2;

        if(arr.length==1){
            return bs(arr,0,0,col-1,target);
        }

        if(col==1){

            for(int i=0;i<arr.length;i++){

                if(arr[i][0]==target)
                    return new int[]{i,0};
            }

            return new int[]{-1,-1};
        }

        while(rs<(re-1)){

            int mid=rs+(re-rs)/2;

            if(arr[mid][mcol]==target)
                return new int[]{mid,mcol};

            else if(arr[mid][mcol]<target)
                rs=mid;

            else
                re=mid;
        }

        if(arr[rs][mcol]==target)
            return new int[]{rs,mcol};

        if(arr[rs+1][mcol]==target)
            return new int[]{rs+1,mcol};

        if(target<=arr[rs][mcol-1])
            return bs(arr,rs,0,mcol-1,target);

        if(target>=arr[rs][mcol+1] && target<=arr[rs][col-1])
            return bs(arr,rs,mcol+1,col-1,target);

        if(target<=arr[rs+1][mcol-1])
            return bs(arr,rs+1,0,mcol-1,target);

        return bs(arr,rs+1,mcol+1,col-1,target);

    }

}