//Input: a[]={52,66,64,36,45,24,32}
//Output: 32+45+64+66=207
public class AccentureQue13 {
    public static int LeaderSum(int[] arr){
        int len = arr.length;
        if(len==0){
            return -1;
        }
        int sum = arr[len-1];
        int max= arr[len-1];
        for(int i=len-2;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                sum = sum+arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr ={52,66,64,36,45,24,32};
        int res=LeaderSum(arr);
        System.out.println("Output: "+res);
    }
}
