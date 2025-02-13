import java.io.*;
import java.util.*;

public class Solution {
    public static int negativeSubArraySumsCounter(int[] arr){
        int n = arr.length;
        int sum = 0;
        int counter = 0;
        
        for(int i = 0;i < n; i++){
            for(int j = i; j < n; j++){
                sum += arr[j];
                if(sum < 0){counter++;}
            }
            sum = 0;
        }
        
        return counter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println(negativeSubArraySumsCounter(arr));
    }
}
