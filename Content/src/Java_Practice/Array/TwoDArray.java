package Java_Practice.Array;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        int[][] arr = new int[3][4];
        Scanner sc = new Scanner(System.in);

        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }

        }
//          printing
        for (int i=0;i<arr.length;i++){
            String s = "";
            for(int j=0;j<arr[0].length;j++){
                s+=arr[i][j]+" ";
            }
            System.out.println(s);
        }


    }
}
