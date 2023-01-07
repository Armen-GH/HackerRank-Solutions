import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        
        System.out.println(A.length() + B.length());
        
        if(A.compareTo(B) <= 0){
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        
        String A_cap = A.substring(0, 1).toUpperCase() + A.substring(1);
        String B_cap = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(A_cap + " " + B_cap);
}
}
