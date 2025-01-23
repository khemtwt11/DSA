package DSA.Problem_Solving.Easy.TwoDArray;
// transpose is to change the position of the square metrics where row becomes column and column becomes row
public class TransposeOfArray {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int arr[][]  = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                       {13,14,15,16},};

        for(int i =1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }


        for(int i =0;i<arr.length;i++){
            String s = "";
            for(int j=0;j<arr[0].length;j++){
                s+=arr[i][j]+" ";
            }
            System.out.println(s);
        }
    }
}
