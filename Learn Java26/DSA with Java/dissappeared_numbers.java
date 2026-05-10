import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class dissappeared_numbers {
    List<Integer> dissappearednumbers(int[] nums){
        Set<Integer> numset=new HashSet<>();
        for (int elem : nums) {
            numset.add(elem);
        }

        List<Integer> result= new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if(!numset.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
    void main() {
        int[] nums = {4,3,2,7,8,2,3,1};
        IO.println(dissappearednumbers(nums));
        //Output: [5,6]
    }
}
