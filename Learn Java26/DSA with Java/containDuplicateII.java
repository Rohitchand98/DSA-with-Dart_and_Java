
void main() {
        //optimal solution
        int[] nums = {1, 2, 3, 1,2,3};
        int n = nums.length;
        int k = 2;
        boolean found=false;
        if (k > nums.length) {
            IO.print(k + " its outside the array");
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= i + k && j < n; j++) {
                if (nums[i] == nums[j]) {
                    IO.print(found=true);
                    break;
                }
            }if (found) break;
        }
        if(!found) IO.print(found);

    }
