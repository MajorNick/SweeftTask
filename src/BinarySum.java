// binary strings sum in ALU style, I know that, just i can parse it as an integer sum and
// turn it back to binary but, I don't know how long is string;


public class BinarySum{
    public static String binarySum(String a,String b){
        StringBuilder ans = new StringBuilder();
        int carry = 0,i = a.length()-1,j=b.length()-1;
        while(carry > 0 || i>=0 || j>=0 ){
            int bit1=0,bit2=0,sum=0;
            if (i>=0){
                bit1 = a.charAt(i--)-'0';
            }
            if (j>=0){
                bit2 = b.charAt(j--)-'0';
            }

            sum = bit1+bit2+carry;
            carry = sum/2;
            ans.insert(0,sum%2);
        }
        return ans.toString();
    }
}