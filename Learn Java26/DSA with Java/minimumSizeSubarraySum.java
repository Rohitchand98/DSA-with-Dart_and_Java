void main(){
    int[] nums={2,3,1,2,4,3};
    int target=7;

    //Optical solution
    int currentsum=0;
    int low=0;
    int minlength=Integer.MAX_VALUE;// its picking min from math integers
    for (int high = 0; high < nums.length; high++) {
        currentsum+=nums[high];
        while (currentsum>=target) { 
            minlength=Math.min(minlength, high-low+1);
            currentsum-=nums[low];
            low++;
        }
    }
    IO.print(minlength==Integer.MAX_VALUE?0:minlength);//its a ternary operator which use var==condition?exception1:exception2;
}