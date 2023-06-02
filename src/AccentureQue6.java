//n=5
//n is odd n-1
//n is even n/2
public class AccentureQue6 {
    public static int NumberOfStep(int n){
        int countstep=0;
        while(n!=0){
            if (n%2==0)
                n=n/2;
            else
                n=n-1;
            countstep++;
        }
        return countstep;
    }
    public static void main(String[] args) {
        int input =9;
        int count = NumberOfStep(input);
        System.out.println("Number of Steps: "+ count);
    }
}
