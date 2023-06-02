//MinMax in two Arrays
//input: a1={9,16,12,5,15}
//        a2={14,7,22,5,32,77}
//k=9
//output:3
// elements greater than 9 i.e k in a1=3,elements less than 9 i.e k in a2=2
//max in both a1 and a2 in 3 so, output is three

import java.sql.SQLOutput;
import java.util.*;
public class AccentureQue9 {
    public static int MinMxInArrays(int a1[],int[]a2,int n1,int n2,int k){
        int count1=0;
        int count2=0;
        for(int i=0; i<n1;i++){
            if(a1[i]>k)
                count1++;
        }
        for(int i=0;i<n2;i++){
            if(a2[i]<k)
                count2++;
        }
        int res= Math.max(count1,count2);
        return res;
    }

    public static void main(String[] args) {
        int[] a1={9,16,12,5,15};
        int[] a2={14,7,22,5,32,77};
        int k=9;
        int n1=a1.length;
        int n2=a2.length;
        int res = MinMxInArrays(a1,a2,n1,n2,k);
        System.out.println("Output: "+ res);
    }
}
