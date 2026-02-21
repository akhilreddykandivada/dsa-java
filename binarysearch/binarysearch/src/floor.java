public class floor {
    public static void main(String[] args) {
        int [] arr={1,7,9,10,68,89,999};
        int target=69;
        System.out.println(celing(arr,target));
    }
    static int celing(int[] arr,int target){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                return mid;
            } else if (target>arr[mid]) {
                s=mid+1;
            } else {
                e=mid-1;
            }

        }
        return arr[e];
    }

    }

