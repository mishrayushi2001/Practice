//        example1
//        input1: 3
//        input2:{1,2,3}
//        output:2
//        Explanation:
//        the order that incurs the minimum penalty is 1,2,3. The penalty is abs(2-1)+bs(3-2)=2
//
//        example 2
//        input1: 4
//        input2: {-2,1,4,6}
//        output:8


import java.util.*;
public class AccentureQue7 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int minPenalty = calculateMinPenalty(arr);
        System.out.println("Minimum Penalty: "+minPenalty);
    }
    public static int calculateMinPenalty(int[] arr){
        int minPenalty =0;
        for(int i=1; i<arr.length;i++){
            minPenalty+=Math.abs(arr[i]-arr[i-1]);
        }
        return minPenalty;
    }
}

