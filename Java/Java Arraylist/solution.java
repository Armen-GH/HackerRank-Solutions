import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d, x, y;

        ArrayList<ArrayList> Arr = new ArrayList<ArrayList>(n);

        for(int i = 0; i < n; i++){
            d = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<Integer>(d);
            for(int j = 0; j < d; j++){
                arr.add(sc.nextInt());
            }
            Arr.add(arr);
        }

        int q = sc.nextInt();

        for(int i = 0; i < q; i++){
            x = sc.nextInt();
            y = sc.nextInt();
            try{
                System.out.println(Arr.get(x-1).get(y-1));
            } catch (IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        }
    }
}
