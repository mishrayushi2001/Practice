//product of sum of all smaller and all greater element

public class AccentureQue3 {
    public static void myfunc(int arr[], int n) {
        int arr2[] = new int[n];
        int small=0;
        int greater =0;
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[j]<arr[i]) {
                    small = small+ arr[j];
                }else if(arr[j]>arr[i]){
                    greater=greater+arr[j];
                }
            }
            arr2[k++]= small*greater;
            small=0;
            greater=0;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr2[i]);
        }
    }

    public static void main(String[] args) {
        int arr[]={8,4,5,3,2,6,9,1};
        int n=arr.length;
        System.out.println(n);
        myfunc(arr,n);
    }
}
