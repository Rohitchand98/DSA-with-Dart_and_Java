
double findMedianSortedArrays(List<int> nums1, List<int> nums2) {
    if (nums1.length > nums2.length) {
      return findMedianSortedArrays(nums2, nums1); // ensure nums1 is smaller
    }

    int m = nums1.length;
    int n = nums2.length;
    int low = 0, high = m;

    while (low <= high) {
      int partitionX = (low + high) ~/ 2;
      int partitionY = (m + n + 1) ~/ 2 - partitionX;

      int maxLeftX = (partitionX == 0) ? -1 << 31 : nums1[partitionX - 1];
      int minRightX = (partitionX == m) ? 1 << 31 : nums1[partitionX];

      int maxLeftY = (partitionY == 0) ? -1 << 31 : nums2[partitionY - 1];
      int minRightY = (partitionY == n) ? 1 << 31 : nums2[partitionY];

      if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
        if ((m + n) % 2 == 0) {
          // Even total length → average of two middle values
          return ((maxLeftX > maxLeftY ? maxLeftX : maxLeftY).toDouble() +
                  (minRightX < minRightY ? minRightX : minRightY).toDouble()) /
              2.0;
        } else {
          // Odd total length → max of left side
          return (maxLeftX > maxLeftY ? maxLeftX : maxLeftY).toDouble();
        }
      } else if (maxLeftX > minRightY) {
        high = partitionX - 1;
      } else {
        low = partitionX + 1;
      }
    }

    throw Exception("Input arrays are not sorted");
  }


  void main() {
    List<int> nums1 = [1, 2];
    List<int> nums2 = [3, 4];
    print(findMedianSortedArrays(nums1, nums2));
  }