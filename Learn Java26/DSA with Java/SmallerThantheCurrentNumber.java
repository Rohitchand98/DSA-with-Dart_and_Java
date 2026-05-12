//void how many numbers are small than the current
int[] smallerNumInArray(int[] nums){

    //This is the brute force method
    /*int[] result=new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
        int count=0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[i]>nums[j]&& i!=j){
                count++;
            }
        }
        result[i]=count;
    }
    return result; */
    

    //hashset Solution
    int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sortedNums.length; i++) {
            // putIfAbsent ensures we only record the index of the FIRST occurrence 
            map.putIfAbsent(sortedNums[i], i);
        }
        
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = map.get(nums[i]);
        }
        
        return result;
}
void main() {
    int[] nums = {8,1,2,2,3};
    IO.print(Arrays.toString(smallerNumInArray(nums)));
}