import java.util.Scanner;

public class AccentureQue20 {
//    public static int AND(int a, int b){
//        if(a==1 && b==1)
//            return 1;
//        return 0;
//    }
//    public static int OR(int a, int b){
//        if(a==0 && b==0)
//            return 0;
//        return 1;
//    }
//    public static int XOR(int a, int b){
//        if(a==b)
//            return 0;
//        return 1;
//    }

    public static int binaryString(String str){
        if(str==null)
            return -1;
        int result = str.charAt(0)-'0';
        for(int i=1;i<str.length();){
            char Operation =str.charAt(i);
            i++;
//            int Operand = str.charAt(i+1);
            if(Operation=='A'){
                result= result&(str.charAt(i) -'0');
            }else if(Operation=='B'){
                result= result|(str.charAt(i)-'0');
            }else
                result = result^(str.charAt(i)-'0');
            i++;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
//        String str ="1C0C1C1A0B1";
//        int res=binaryString(str);
        System.out.println(binaryString(str));
    }
}
