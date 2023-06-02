//Number of ways to tile a wall
public class AccentureQue2  {
    public static void myfunc(int n, int m){
        int count[] = new int[n+1];
        count[0] =0;
        for(int i=1;i<=n;i++){
            if(i<m){
                count[i]=1;
            }
            else if(i==m){
                count[i]=2;
            }
            //if m<n
            else{
                count[i]=count[i-1]+count[i-m];
            }
        }
        System.out.println("Number of ways= " +count[n]);
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        myfunc(5,3);
    }

}
