public class element_search_array {
    int mains(int[] nums, int target){
    for (int i = 0; i < nums.length; i++) {
        if(nums[i]==target){
            IO.println("Yes element is in array "+target+" in the index of "+i);
            break;
        }
    }
    return target;
}

void main() {
    int[] nums={1,2,3,4,5};
    mains(nums, 5);
}
}
