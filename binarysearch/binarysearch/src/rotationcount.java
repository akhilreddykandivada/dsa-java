public class rotationcount {
    public static void main(String[] args) {
        int[]nums={3,4,5,1,2};
        System.out.println(pivot(nums));
    }
        static int pivot(int[]nums){
        int p=0;
        int s=0,e=nums.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(nums[mid]<nums[mid-1]){
                return mid-1;
            }
            else if(nums[mid]>nums[s]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;
    }
}
