//You are required to implement the following function intCountSpecificNumbers(int m, int n);
//The function accepts two arguments m and n which are integers. You are required to calculate
//the count of numbers having only 1, 4 and 9 as their digits between the numbers lying in the
//range m and n both inclusive, and return the same, Return-1 if m>n
//        Sample Input:
//        100
//        200
//        Sample Output:
//        9
import java.util.Scanner;

public class AccentureQue23 {
    public static int countSpecificNumber(int n, int m) {
        int count = 0;
        if (n>m)
            return -1;
        for (int i = n; i <= m; i++) {
            int num = i;
            int flag = 1;
            while (num>0) {
                int n2 = num % 10;
                num = num / 10;
                if (n2 == 1 || n2 == 4 || n2 == 9)
                    continue;
                else {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();
        int result = countSpecificNumber(n1, m1);
        System.out.println("Result: " + result);
    }
}
