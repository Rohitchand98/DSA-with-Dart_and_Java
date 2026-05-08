//duplicate value in array
public boolean duplicatevalue(int[] nums) {
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if (nums[i-1]== nums[i]) {
                return true;
            }
    }
    return false;
}

void main() {
    int[] nums = {3,2,4,1}; 
    IO.println(duplicatevalue(nums));
}