//First;y adding only positive integers in hashset and
//  then finding first element which isn't equal to index;
// O(nlogn) solution

import java.util.*;

public class NotContains{
    public static int notContains(int[] array){
    Set<Integer> st = new HashSet<>();
    for (int i=0;i<array.length;i++){
        if (array[i]>0) {
            st.add(array[i]);
        }
    }
    int k = 1;
    while(true){
        if (!st.contains(k)){
            return k;
        }
        k++;
        }
    }
}