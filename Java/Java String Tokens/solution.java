import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        if(s.trim().length() == 0 || s.trim().length() > 400000){
            System.out.println(0);
            return;
        }

        String[] arrayOfS = s.trim().split("[ !,?.\\_'@]+");
        
        System.out.println(arrayOfS.length);

        for(String word:arrayOfS){
            System.out.println(word);
        }
    }
}
