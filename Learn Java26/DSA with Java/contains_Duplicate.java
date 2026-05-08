//duplicate value in array
public boolean duplicatevalue(int[] nums) {
    //Brute force Solution 
    /*Arrays.sort(nums);
    for(int i=1; i<nums.length; i++){
            if (nums[i-1]== nums[i]) {
                return true;
            }
    }
    return false;*/
    //efficient and optical solution hashset
    HashSet<Integer> numseen= new HashSet<>();
        for(int num:nums){
            if(!numseen.add(num)){
                return true;
            }
        }
    return false;


}

void main() {
    int[] nums = {3,2,4,1}; 
    IO.println(duplicatevalue(nums));
}