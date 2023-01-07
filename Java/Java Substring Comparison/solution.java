import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = sc.nextInt();
        
        List<String> substrings = new ArrayList<String>();
        
        int i = 0;
        while(i <= s.length()-l){
            String a = s.substring(i,i+l);
            substrings.add(a);
            i++;
        }
        
        Collections.sort(substrings);
        
        System.out.println(substrings.get(0));
        System.out.println(substrings.get(substrings.size()-1));
    }   
}
