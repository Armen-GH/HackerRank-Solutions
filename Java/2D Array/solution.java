import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[6][6];
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 6; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        int max = -100000, sum;
        for(int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum = arr[i][j]   + arr[i][j+1]   + arr[i][j+2]
                                  + arr[i+1][j+1]
                    + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if (sum > max) {max = sum;}
            }
        }

        System.out.println(max);
    }
}
