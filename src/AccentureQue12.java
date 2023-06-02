//not understood
import java.util.*;
public class AccentureQue12 {
    static Map<Character,Integer> dict1= new HashMap<>();
    static Map<Integer,Character> dict2 = new HashMap<>();
    static void create_dict(){
        for(int i=1;i<27;i++)
            dict1.put((char)(64+i),i);
        dict2.put(0,'Z');
        for(int i=1; i<26; i++)
            dict2.put(i,(char)(64+i));
    }
    static String encrypt(String message, int shift) {
        String cipher= " ";
        for(int i = 0; i<message.length();i++) {
            if (message.charAt(i) != ' ') {
                int num = (dict1.get(message.charAt(i)) + shift) % 26;
                cipher += dict2.get(num);
            } else {
                cipher += " ";
            }
        }
        return message;
//        retrun cipher;
    }





    public static void main(String[] args) {
        create_dict();
        String message = "Hello World";
        int shift =13;

        System.out.println(encrypt(message,shift));
    }


}
