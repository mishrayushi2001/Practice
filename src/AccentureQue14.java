//Password Checker Problem
//String 'str' is a valid Password if
//1. At least 4 characters
//2. At least one numeric digit
//3.At least one capital letter
//4. Must not have space or slash(/)
//5. Starting character must not be a number
//
//abcD123 return 1
//gk_29ab return 0
import java.util.*;
public class AccentureQue14 {
    public static int isValidPassword(String str){

        if(str.length()<4){
            return 0;
        }
        boolean num =false;
        for(char c: str.toCharArray()){
            if(c>='0' && c<='9'){
                num=true;
                break;
            }
        }
        if(!num){
            return 0;
        }
        boolean hasCapitalLetter= false;
        for(char c:str.toCharArray()){
            if(c>='A' && c<='Z'){
                hasCapitalLetter=true;
                break;
            }
        }
        if(!hasCapitalLetter){
            return 0;
       }
        for(char c:str.toCharArray()){
            if(c==' '|| c == '/'){
                return 0;
            }
        }
        char firstChar=str.charAt(0);
        if(firstChar>='0' && firstChar<='9') {
            return 0    ;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter password: ");
        String str= sc.nextLine();
        int password= isValidPassword(str);
        System.out.println("Valid password: " +password);
    }
}
