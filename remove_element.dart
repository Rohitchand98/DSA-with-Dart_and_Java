int removeElement(List<int> nums, int val) {
  int k = 0; // The slow pointer

  for (int i = 0; i < nums.length; i++) {
    // If the current element is NOT the one we want to remove
    if (nums[i] != val) {
      // Move it to the 'k' position
      nums[k] = nums[i];
      // Move the slow pointer forward
      k++;
    }
  }

  // k now represents the count of elements not equal to val
  return k;
}

void main() {
  List<int> nums = [0, 1, 2, 2, 3, 0, 4, 2];
  int val = 2;

  int k = removeElement(nums, val);

  print('Count (k): $k');
  print('Modified List: ${nums.sublist(0, k)}'); 
  // Output: Count (k): 5, Modified List: [0, 1, 3, 0, 4]
}