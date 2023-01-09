import java.io.*;
import java.util.*;
import java.math.BigDecimal;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] SA = new String[n];

        for (int i = 0; i < n; i++) {
            SA[i] = sc.nextLine();
        }

        Comparator<String> customComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                BigDecimal a = new BigDecimal(o1);
                BigDecimal b = new BigDecimal(o2);
                return b.compareTo(a);
            }
        };
        
        Arrays.stream(SA).sorted(customComparator).forEach(System.out::println);
    }
}
