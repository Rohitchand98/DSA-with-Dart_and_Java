import java.util.ArrayList;
import java.util.List;

public class dissappeared_numbers {
    List<Integer> dissappearednumbers(int[] nums){
        //its the Brute force method
        /*Set<Integer> numset=new HashSet<>();
        for (int elem : nums) {
            numset.add(elem);
        }

        List<Integer> result= new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if(!numset.contains(i)){
                result.add(i);
            }
        }
        return result; */
        
        //Optimal solution
         int[] arr = new int[nums.length + 1];
        int index =0;

        for (int i = 0; i < nums.length; i++) {

            index = nums[i];
            arr[index]++;
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < nums.length + 1; i++) {
            if (arr[i] == 0) {
                list.add(i);
            }
        }
        return list;
    }
    void main() {
        int[] nums = {4,2,7,2,8,3,1};
        IO.println(dissappearednumbers(nums));
    }
}
