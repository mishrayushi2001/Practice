//Trailing Zeroes
public class AccentureQue5 {
    public static int countTrailingZeros(int n) {
        int count = 0;
        while (n > 0) {
            n /= 5;
            count += n;
        }
        return count;
    }
    public static void main(String[] args) {
        int input1 = 5;
        int count1 = countTrailingZeros(input1);
        System.out.println("Number of trailing zeros in " + input1 + "! : " + count1);

        int input2 = 10;
        int count2 = countTrailingZeros(input2);
        System.out.println("Number of trailing zeros in " + input2 + "! : " + count2);
    }
}
