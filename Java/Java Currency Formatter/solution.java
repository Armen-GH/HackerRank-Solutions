import java.io.*;
import java.util.*;
import java.text.NumberFormat;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double amount = sc.nextDouble();
        
        Locale INDIA = new Locale("en", "in");
        
        System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(amount));
        System.out.println("India: " + NumberFormat.getCurrencyInstance(INDIA).format(amount));
        System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(amount));
        System.out.println("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount));
    }
}
