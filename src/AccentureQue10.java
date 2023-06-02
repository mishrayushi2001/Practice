//Write a function SmallLargeSum(array) which accepts the array as an
// argument or parameter, that performs the addition of the secondLargest
// element from the even location with the secondLargest element from an
// odd location?
//        example: Input: 7
//        1 8 0 2 3 5 6
//        Output: 8

import java.util.*;
public class AccentureQue10 {
    public static int SmallLargeSum(int[] arr){
    //Filter even and odd location elements
        int[] evenElements= new int[arr.length/2];
        int[] oddElements= new int[arr.length/2];
        for(int i=0; i<arr.length; i++) {
            if (i % 2 == 0)
                evenElements[i / 2] = arr[i];
            else
                oddElements[i / 2] = arr[i];
        }
        Arrays.sort(evenElements);
        Arrays.sort(oddElements);
        // Retrieve the secondLargest elements
        int secondLargestEven = evenElements[evenElements.length - 2];
        int secondLargestOdd = oddElements[oddElements.length - 2];

        // Calculate the sum and return the result
        return secondLargestEven + secondLargestOdd;
    }

    public static void main(String[] args) {
        int[] arr={1,8,0,2,3,5,6};
        int res= SmallLargeSum(arr);
        System.out.println("Output: "+res);
    }
}
