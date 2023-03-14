// Very common  Dynamic programming problem
// O(N) solution
public class CountVariants{
    public static int countVariants(int stairsCount){
        int[] arr = new int[stairsCount];
        arr[0] = 1;
        arr[1] = 2;
        for(int i=2;i<stairsCount;i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[stairsCount-1];
    }
}