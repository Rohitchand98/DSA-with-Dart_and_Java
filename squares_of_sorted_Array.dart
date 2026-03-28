class Solution {
  List<int> sortedSquares(List<int> nums) {
    int n = nums.length;
    List<int> result = List.filled(n, 0);

    int left = 0;
    int right = n - 1;
    int pos = n - 1;

    while (left <= right) {
      int leftVal = nums[left].abs();
      int rightVal = nums[right].abs();

      if (leftVal > rightVal) {
        result[pos] = leftVal * leftVal;
        left++;
      } else {
        result[pos] = rightVal * rightVal;
        right--;
      }
      pos--;
    }

    return result;
  }
}
