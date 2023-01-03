import java.io.*;
import java.util.*;
import java.lang.Math;
import java.util.InputMismatchException;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for(int i = 0; i < T; i++){
            try {
                long n = sc.nextLong();
            
                System.out.println(n + " can be fitted in:");
                
                if(n >= -128 && n <= 127){ //we can also use Byte.Min_Value & Byte.Max_Value
                    System.out.println("* byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if(n >= -32768 && n <= 32767){
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if(n >= Math.pow(-2,31) && n <= Math.pow(2,31)-1){
                    System.out.println("* int");
                    System.out.println("* long");
                } else if(n >= Math.pow(-2,63) && n <= Math.pow(2,63)-1){
                    System.out.println("* long");
                }
            } catch(InputMismatchException e){
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}
