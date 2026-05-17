
void main(){
    int[] nums = {-4,-1,0,3,10};
    
    //this is the brute force solution
    int[] result=new int[nums.length];
    for (int elem=0; elem<nums.length;elem++) {
        result[elem]=nums[elem]*nums[elem];
    }
    Arrays.sort(result);
    IO.print(Arrays.toString(result));

    

}