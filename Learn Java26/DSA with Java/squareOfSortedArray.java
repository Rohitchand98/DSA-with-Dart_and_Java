
void main(){
    int[] nums = {-4,-1,0,3,10};
    
    //this is the brute force solution

    /*int[] result=new int[nums.length];
    for (int elem=0; elem<nums.length;elem++) {
        result[elem]=nums[elem]*nums[elem];
    }
    Arrays.sort(result);
    IO.print(Arrays.toString(result)); */

    //This is the optimal solution which will use two pointer to square then sort itself
    int first=0;
    int last=nums.length-1;
    int[] result=new int[nums.length];

    for (int i = nums.length-1; i >=0; i--) {
        int squareFirst=nums[first]*nums[first];
        int squareLast= nums[last]*nums[last];
        if (squareFirst>squareLast) {
            result[i]=squareFirst;
            first++;
        } else {
            result[i]=squareLast;
            last--;
        }
    }
    IO.print(Arrays.toString(result));
    
}