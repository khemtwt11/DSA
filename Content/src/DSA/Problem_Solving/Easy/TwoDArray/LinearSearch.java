package DSA.Problem_Solving.Easy.TwoDArray;
// linear search on two D array

/*
   1,2,3
   4,5,6
   7,8,9

 */
public class LinearSearch {
    static boolean linearSearchInTwoDArray(int[][] matrix, int target){

        for (int i = 0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,5,19},
                {8,29,12},
                {23,99,23},
        };
        int target  = 90;
        System.out.println(linearSearchInTwoDArray(matrix,target));
    }
}
