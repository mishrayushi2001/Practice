//Maxmum length subarray having equal no. of 0& 1 given an array of size n.
// It contains only 0s and 1s in it. Find the maximum length of subarray where there are equal no. 0s& 1s is present

import java.util.*;
public class AccentureQue8 {
    public static int maxSubArrayLength(int[]arr){
        int maxLength=0;
        int count=0;
        Map<Integer,Integer> countMap = new HashMap<>();
        countMap.put(0,-1);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                count--;
            else count++;
            if(countMap.containsKey(count)){
                int prevIndex=countMap.get(count);
                int subarrayLength=i-prevIndex;
                maxLength = Math.max(maxLength,subarrayLength);
            }
            else{countMap.put(count,i);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("");
        int[]arr={0,0,1,0,1,};
        int maxLength=maxSubArrayLength(arr);
        System.out.println("Maximum length of Subarray: "+maxLength);
    }

}
