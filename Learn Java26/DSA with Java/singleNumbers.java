void main(){
    //its bit manipulation
    int[] nums={4,1,2,1,2};
    int xor = 0;
    for (int i : nums) {
        //we will perform XOR here like
        /* logic here is 
            2=10
            2=10
            1=01 
            ->2nd ,0xor0=0 then 0xor1=1
            ->1st, 1xor1=0 then 0xor0=0
            -> 01 which mean Answer is 1
         */
        xor^=i;
    }
    IO.print(xor);
}
