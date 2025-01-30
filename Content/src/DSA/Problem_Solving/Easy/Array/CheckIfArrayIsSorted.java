package DSA.Problem_Solving.Easy.Array;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = new int[]{2,2,2,2};
        boolean ifSorted = true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                ifSorted = false;
                break;
            }

        }

        System.out.println("Is array sorted: "+ifSorted);
    }
}
