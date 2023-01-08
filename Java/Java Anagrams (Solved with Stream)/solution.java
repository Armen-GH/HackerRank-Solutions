import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        Map<Character, Long> frequencyA =
                a.toLowerCase().chars()
                        .mapToObj(c -> (char)c)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<Character, Long> frequencyB =
                b.toLowerCase().chars()
                        .mapToObj(c -> (char)c)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        if(frequencyA.entrySet().equals(frequencyB.entrySet())){
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
