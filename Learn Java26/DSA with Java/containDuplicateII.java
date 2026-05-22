import java.util.HashSet;
import java.util.Set;

void main() {
        //optimal solution
        /*int[] nums = {1, 2, 3, 1,2,3};
        int n = nums.length;
        int k = 2;
        boolean found=false;
        if (k > nums.length) {
            IO.print(k + " its outside the array");
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= i + k && j < n; j++) {
                if (nums[i] == nums[j]) {
                    IO.print(found=true);
                    break;
                }
            }if (found) break;
        }
        if(!found) IO.print(found); */

        int[] nums = {1, 2, 3, 1,2,3};
        int k=3;
        boolean found=false;
        Set<Integer> slidingwindow=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(slidingwindow.contains(nums[i])){
                found=true;
                IO.print(found);
                break;
            }

            slidingwindow.add(nums[i]);
            if(slidingwindow.size()>k){
                slidingwindow.remove(nums[i-k]);
            }
             if(found)break;
        }//for loop safety
        if(!found)IO.print(found);
        

    }
