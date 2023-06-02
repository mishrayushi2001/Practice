//Sum of the prime factors of a Number
//Input: n=20
//Output: 7
//20->1,2,4,5,10 \\ 2,5->2+5

import java.util.Scanner;

public class AccentureQue17 {
    public static int sumPrimeFactor(int n){
        int i=2;
        int sum=0;
        int current_factor = -1;

        while(n>1){ //20->10->5
            if(n%i==0){  //20%2=10->10%2=0 ->5%2!=0 ->5%3!=0->5%4!=0 ->5%==0
                if(i!=current_factor){ //2!=0
                    sum+=i;  //0+2+5
                    current_factor=i; //2->5
                }
                n=n/i; //10 ->5->1
            }
            else {
                i++;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=sc.nextInt();
        int res= sumPrimeFactor(n);
        System.out.println(res);
    }
}
