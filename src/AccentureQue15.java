//Rat Count House
//Return -1 if the array is null
//        Return 0 if the total amount of food from all houses is not sufficient for all the rats.
//        Computed values lie within the integer range.
//        Input:
//        r: 7
//        unit: 2
//        n: 8
//        arr: 2 8 3 5 7 4 1 2
//        Output: 4
import java.util.*;
public class AccentureQue15 {
    public static int ratCountHouse(int r,int unit, int[]arr, int n) {
        if (arr == null)
            return -1;
        int count = 0;
        int sum = 0;
        int requiredFood = r * unit;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            count++;
            if (sum >= requiredFood)
                break;
        }if (sum < requiredFood)
            return 0;
        return count;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int rat = sc.nextInt();
        int food = sc.nextInt();
        int size = sc.nextInt();
        int ar[] = new int[size];

        for (int i = 0; i < size; i++)
            ar[i] = sc.nextInt();
        System.out.println(ratCountHouse(rat, food, ar, size));
    }
}

