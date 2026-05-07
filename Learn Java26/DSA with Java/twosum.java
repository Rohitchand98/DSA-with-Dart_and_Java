
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//brute force solution with O(n^2) time complexity
/*public int[] twosum(int[] nums, int target) {
    for(int i=0;i<nums.length; i++){
        for (int j = i+1; j < nums.length; j++) {
            if (nums[i]+nums[j]==target) {
                return new int[]{i,j};
            }
        }
    }
    return new int[]{};
}*/

//Optimal and efficient solution we will use hashmap for this to check on integer values
public int[] twosum(int[] nums, int target) {
    Map<Integer, Integer> mapNm=new HashMap<>();
    for(int i=0; i<nums.length; i++){
        int secondelement=target-nums[i];
        if (mapNm.containsKey(secondelement)) {
            return new int[]{mapNm.get(secondelement),i};
        }
        mapNm.put(nums[i], i);
    }
    return new int[]{};
}

void main() {
    int[] nums = {3,2,4}; 
    int target = 6;
    IO.println(Arrays.toString(twosum(nums, target)));
}