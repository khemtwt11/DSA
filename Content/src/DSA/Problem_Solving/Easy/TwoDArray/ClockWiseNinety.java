package DSA.Problem_Solving.Easy.TwoDArray;

// pass by refrence where the value is actually refrences, there's no new copy which get's created.
public class ClockWiseNinety {

    public static void transpose(int[][] arr){
        // transpose
        for(int i=1;i<arr.length;i++){
            for( int j =0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // reverse
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length/2;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr.length-j-1];
                arr[i][arr.length-j-1]= temp;

            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };

        //int[][] a = new int[4][4];

        transpose(arr);
        // printing
        for(int i=0;i<arr.length;i++){
            String s = "";
            for( int j=0;j<arr.length;j++){
                s+=arr[i][j]+" ";
            }
            System.out.println(s);
        }


    }
}


/*Brute force aproach


        for(int i=0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                a[j][arr.length-i-1] = arr[i][j];
            }
        }

        // printing
        for(int i=0;i<arr.length;i++){
            String s = "";
            for(int j = 0;j<arr.length;j++){
               s+=a[i][j]+" ";
            }
            System.out.println(s);
        }

 */