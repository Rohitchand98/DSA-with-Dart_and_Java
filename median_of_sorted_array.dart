//systemetic way approach
//
// double medianByBinarySearch(List<int> a, List<int> b) {
//   // Ensure a is the smaller array
//   if (a.length > b.length) return medianByBinarySearch(b, a);

//   int m = a.length;
//   int n = b.length;
//   if (m + n == 0) throw ArgumentError('Both arrays are empty');

//   int low = 0, high = m;

//   while (low <= high) {
//     int partitionA = (low + high) ~/ 2;
//     int partitionB = (m + n + 1) ~/ 2 - partitionA;

//     double maxLeftA = (partitionA == 0) ? double.negativeInfinity : a[partitionA - 1].toDouble();
//     double minRightA = (partitionA == m) ? double.infinity : a[partitionA].toDouble();

//     double maxLeftB = (partitionB == 0) ? double.negativeInfinity : b[partitionB - 1].toDouble();
//     double minRightB = (partitionB == n) ? double.infinity : b[partitionB].toDouble();

//     if (maxLeftA <= minRightB && maxLeftB <= minRightA) {
//       if ((m + n) % 2 == 0) {
//         double leftMax = maxLeftA > maxLeftB ? maxLeftA : maxLeftB;
//         double rightMin = minRightA < minRightB ? minRightA : minRightB;
//         return (leftMax + rightMin) / 2.0;
//       } else {
//         return (maxLeftA > maxLeftB ? maxLeftA : maxLeftB);
//       }
//     } else if (maxLeftA > minRightB) {
//       high = partitionA - 1;
//     } else {
//       low = partitionA + 1;
//     }
//   }

//   throw StateError('Unable to find median — ensure arrays are sorted');
// }


//Not the complete Solution but worked by Programmer logic
double findMedianSortedArrays(List<int> nums1, List<int> nums2) {
  int m = nums1.length;
  int n = nums2.length;
  int totalLength = m + n;

  int i = 0, j = 0;
  int current = 0, previous = 0;

  for (int count = 0; count <= totalLength ~/ 2; count++) {
    previous = current;

    if (i < m && (j >= n || nums1[i] < nums2[j])) {
      current = nums1[i];
      i++;
    } else {
      current = nums2[j];
      j++;
    }
  }

  if (totalLength % 2 == 0) {
    return (previous + current) / 2.0;
  } else {
    return current.toDouble();
  }
}

void main() {
  List<int> nums1 = [1, 2];
  List<int> nums2 = [5];
  print(findMedianSortedArrays(nums1, nums2));
}