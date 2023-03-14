// Making optimal step every time, Greedy solution
// O(1) solution
public class MinSplit{
    public static int minSplit(int amount){

        int[] coins = {50,20,10,5,1};
        int ans = 0;
        for (int i=0;i<coins.length;i++){
            ans += amount/coins[i];
            amount%=coins[i];
        }
        return ans;
    }
}