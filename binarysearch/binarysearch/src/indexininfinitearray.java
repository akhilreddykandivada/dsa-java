public class indexininfinitearray {
    public static void main(String[] args) {
        int []arr={1,7,8,9,44,55,66,77};
        int target=66;
        int s=0,e=1;
        while(target>arr[e]){
            
            int temp=e+1;
            e=e+(e-s+1)*2;
            if(e>arr.length){
                e=arr.length-1;
            }
            s=temp;
        }
        while(s<=e){
          int mid=s+(e-s)/2;
          if(arr[mid]==target){
            System.out.println(mid);
            break;
          }
          else if(target>arr[mid]){
            s=mid+1;

          }
          else{
            e=mid-1;
          }

        }
    }
}
