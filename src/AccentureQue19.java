import java.util.Scanner;

import static java.lang.Math.abs;

//FindCount()
//Input: arr[]={12,3,14,56,77,13}
//num=13
//diff=2
public class AccentureQue19 {

    public static int FindCount(int num, int diff, int[] arr){
        int count =0;
        for(int i=0; i<arr.length;i++){
            if(abs(arr[i]-num)<=diff){
                count++;
            }
            int res=count>0?count:-1;
            return res;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.: ");
        int num =sc.nextInt();
        System.out.println("Enter the diff: ");
        int diff = sc.nextInt();
        System.out.println("Enter the Array: ");
        int length= sc.nextInt();
        int[] arr=new int[length];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int res = FindCount(num,diff,arr);
        System.out.println("Output: "+res);
    }
}
