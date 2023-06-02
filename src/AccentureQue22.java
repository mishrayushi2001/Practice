//input1: 6
//input2: (1,4,4,7,8,8,9)
//Output: (4,8)
//Explanation:
//4 and 8 are duplicate (occurring more than once) elements in the given array. So, the output will be an
//array containing 4 and 8

import java.util.*;
public class AccentureQue22 {
    public static List<Integer> duplicateElement(int n, int[]arr) {
        List<Integer> duplicates = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (!seen.add(arr[i]) && !duplicates.contains(arr[i])) {
                duplicates.add(arr[i]);
            }
        }
        return duplicates;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter Array: ");
        int[] arr=  new int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        System.out.println(duplicateElement(n,arr));

    }
}
