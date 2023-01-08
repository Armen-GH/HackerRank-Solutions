import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        StringBuilder s1 = new StringBuilder();
        s1.append(s);
        s1.reverse();
        
        if(s.equals(s1.toString())){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

