import java.io.*;
import java.util.*;
import java.lang.Math;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int q = sc.nextInt();
        
        for(int i = 0; i < q; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            
            int series = a;
            int j = 0;
            while(j < n){
                int series_plus = series + (int)Math.pow(2, j) * b;
                System.out.print(series_plus + " ");
                series = series_plus;
                j++; 
            }
            System.out.print("\n");
        }
    }
}
