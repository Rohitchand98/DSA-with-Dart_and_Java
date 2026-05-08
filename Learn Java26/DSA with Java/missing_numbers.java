
public int missingNumber(int[] nums) {
    //this is brute force approach
    //its written by my own logic and codes
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
        if (i!=nums[i]) {
            return i;
        }
    }
    return nums.length;

    //Now efficient method
}
void main() {
    int [] nums={0,1};
    IO.println(missingNumber(nums));
}
    

