//Count Specific Numbers
//m=20        count of no. only having 1,4 and 9 between n and m
//n=50

//count of all permutation of strings
public class AccentureQue4 {
    public static int permutation(String str){
        int n =str.length();
        int factorial= factorial(n);
        int frequency[] =new int[26];
        for(int i=0;i<n;i++){
            char c =str.charAt(i);
            frequency[c-'a']++;
        }
        for(int i=0;i<26;i++){
            if(frequency[i]>1){
                factorial/=factorial(frequency[i]);
            }
        }
        return factorial;
    }
    private static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        String input = "abc";
        int count =permutation(input);
        System.out.println("Count of permutation: "+count);

    }
}
