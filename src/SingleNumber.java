
// we now that xor of same numbers is and xor(0,n) is n so simple iterations and thats all,
//but in the case of odd number of duplicates of elements, this solution won't work anymore;
// O(n) solution
public class SingleNumber {
        public static int singleNumber(int[] nums){
            int ans =0;
            for(int i=0;i<nums.length;i++){
                ans ^= nums[i];
            }
            return ans;
        }
    }
