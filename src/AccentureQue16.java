// not correct


import static java.lang.StrictMath.pow;

public class AccentureQue16 {
    public static int setBit(int n, int set){
        int ans=0;
        for (int i=0; i<pow(2,n);i++){
            int count =0;
            int x =i;
            while(x>0){
                if((x & 1)==1)
                    count++;
                x=x>>1;
            }
            if(count==set)
                ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n=3;
        int set =2;
        int res= setBit(n,set);
        System.out.println("Output: " +res);
    }
}
