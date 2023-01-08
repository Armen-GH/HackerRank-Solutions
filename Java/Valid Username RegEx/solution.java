import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        String AN_pattern = "^[\\p{IsAlphabetic}\\p{IsDigit}_]+$";
        String A_pattern = "^[\\p{IsAlphabetic}]+$";
        
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            
            if((s.length() >= 8 && s.length() <= 30) && (s.matches(AN_pattern)) && (s.substring(0,1).matches(A_pattern))){
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
