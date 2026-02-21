public class nofevendigitsinarray {
    public static void main(String[] args) {
    int[] arr={12,7,666,9898,7777};
        System.out.println(even(arr));
}
static int even(int[] arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
           int  n=arr[i];
           int cnt=0;
            while(n>0){
                n=n/10;
                cnt++;
            }
            if(cnt%2==0){
                sum+=1;
            }

        }
        return sum;
}
}

