import java.util.ArrayList;
import java.util.List;

void main(){
    int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
    
    List<Integer> result=new ArrayList<>();
    if(nums==null||nums.length==0){
        IO.print(result);
    }
    int top=0;
    int bottom=nums.length-1;
    int left=0;
    int right= nums[0].length-1;

    while(top<=bottom && left<=right){
        for (int i = left; i <= right; i++) {
            result.add(nums[top][i]);
        }
        top++;
            for (int i = top; i <= bottom; i++) {
                result.add(nums[i][right]);
            }
        right--;

        if(top<=bottom){
            for (int i = right; i >= left; i--) {
                result.add(nums[bottom][i]);
            }
        }
        bottom--;

        if(left<=right){
            for (int i = bottom; i>= top; i--) {
                result.add(nums[i][left]);
            }
        }
        left++;
    }
    IO.print(result);
}