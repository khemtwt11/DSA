package DSA.Problem_Solving.Easy.Array;

// return the index of two elements whose sum is equal to k
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = new int[]{1,0,7,7,1};
        int k = 1;
        int n = arr.length;
        boolean pairFound = false;
        for(int i=0;i<n;i++){
            int res = k -arr[i]; // k - arr[i] = arr[j]

            for(int j = i+1;j<n;j++){
                if(res == arr[j]){
                    pairFound = true;
                    System.out.println(i+" : "+j);
                    break;
                }
            }
            if(pairFound){
                break;
            }
        }
        if(pairFound==false) {
            System.out.println("pair not found");
        }
    }
}
