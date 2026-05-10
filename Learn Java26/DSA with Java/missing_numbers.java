
public int missingNumber(int[] nums) {
    //this is brute force approach
    //its written by my own logic and codes
    /* Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
        if (i!=nums[i]) {
            return i;
        }
    }
    return nums.length;*/
    

    //Now optimal method(using math)
    int n=nums.length;
    int totalvalue=n*(n+1)/2;
    int elementinarray=0;
    for(int num: nums){
        elementinarray+=num;
    }
    return totalvalue-elementinarray;
    
}
void main() {
    int[] nums={0,1,2};
    IO.println(missingNumber(nums));
}
    

