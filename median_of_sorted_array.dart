double findMedianSortedArrays(List<int> nums1, List<int> nums2) {
  // Ensure nums1 is the smaller array
  if (nums1.length > nums2.length) {
    return findMedianSortedArrays(nums2, nums1);
  }

  int m = nums1.length;
  int n = nums2.length;
  int imin = 0, imax = m;
  int halfLen = (m + n + 1) ~/ 2;

  while (imin <= imax) {
    int i = (imin + imax) ~/ 2;
    int j = halfLen - i;

    if (i < m && nums2[j - 1] > nums1[i]) {
      // i is too small, must increase it
      imin = i + 1;
    } else if (i > 0 && nums1[i - 1] > nums2[j]) {
      // i is too big, must decrease it
      imax = i - 1;
    } else {
      // i is perfect
      int maxLeft;
      if (i == 0) {
        maxLeft = nums2[j - 1];
      } else if (j == 0) {
        maxLeft = nums1[i - 1];
      } else {
        maxLeft = nums1[i - 1] > nums2[j - 1] ? nums1[i - 1] : nums2[j - 1];
      }

      if ((m + n) % 2 == 1) {
        return maxLeft.toDouble();
      }

      int minRight;
      if (i == m) {
        minRight = nums2[j];
      } else if (j == n) {
        minRight = nums1[i];
      } else {
        minRight = nums1[i] < nums2[j] ? nums1[i] : nums2[j];
      }

      return (maxLeft + minRight) / 2.0;
    }
  }

  throw Exception("Input arrays are not sorted or invalid.");
}

void main() {
  List<int> nums1 = [1, 3];
  List<int> nums2 = [2];
  print(findMedianSortedArrays(nums1, nums2)); // Output: 2.0

  nums1 = [1, 2];
  nums2 = [3, 4];
  print(findMedianSortedArrays(nums1, nums2)); // Output: 2.5
}
