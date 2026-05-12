//void how many numbers are small than the current
int[] smallerNumInArray(int[] nums){

    //This is the brute force method
    /* */
    int[] result=new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
        int count=0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[i]>nums[j]&& i!=j){
                count++;
            }
        }
        result[i]=count;
    }
    return result;

    //hashset Solution
}
void main() {
    int[] nums = {8,1,2,2,3};
    IO.print(Arrays.toString(smallerNumInArray(nums)));
}