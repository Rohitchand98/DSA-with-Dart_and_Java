# Dart keywords or advanced keyword explained

## int val1 = p1 < arr1.length ? arr1[p1] : 1 << 31;
    the ternary operator (condition ? valueIfTrue : valueIfFalse) to decide what value val1 should take.

    Breaking it down:
    p1 < arr1.length → checks if the pointer p1 is still within the bounds of arr1.

    If true → val1 = arr1[p1] (take the current element).

    If false → val1 = 1 << 31.

    What does 1 << 31 mean?
        << is the left shift operator.
        1 << 31 means "shift the binary number 1 left by 31 positions."
        In binary, 1 is 000...0001.
        Shifting left by 31 bits gives 1000...0000 (a 1 followed by 31 zeros).
        In decimal, this equals 2,147,483,648.

## int maxLeftX = (partitionX == 0) ?  -1 << 31 : nums1[partitionX - 1];
    that -1 << 31 is being used as a sentinel value—basically a stand‑in for “negative infinity.”

    Why do we need this?
    In the binary search partition method:
    We split both arrays into left and right halves.

    Sometimes the partition is at the very beginning or very end of an array.

    If the partition is at the start, there’s no “left element” → so we pretend it’s negative infinity.

    If the partition is at the end, there’s no “right element” → so we pretend it’s positive infinity.

    This way, comparisons like maxLeftX <= minRightY still work without throwing index errors.
        But what does -1 << 31 actually mean?
        << is the left shift operator.
        -1 << 31 shifts the binary representation of -1 left by 31 bits.
        In Java, this evaluates to Integer.MIN_VALUE (≈ -2,147,483,648).
        In Dart, integers are unbounded, but the intent is the same: use a very small number to represent “negative infinity.”

## LeetCode “Missing Number” problem
Step-by-Step Explanation
Input list
    List<int> lst = [1, 2, 4];
    This is the array of numbers. It’s supposed to contain all numbers from 0 to n, but one is missing.

    Length of the list

    int n = lst.length; // n = 3
    The list has 3 elements.

    Expected sum formula

    double totalsum = (n * (n + 1)) / 2;
    Formula for sum of first n natural numbers: 
    𝑛(𝑛+1)2.
    Here, 𝑛=3, so totalsum = 3×4/2=6.
    This means if the list had numbers 0,1,2,3, the sum should be 6.

    Actual sum of given list

    double currentsum = 0;
    for (int i = 0; i < lst.length; i++) {
    currentsum += lst[i];
    }
    Adds up the list: 
    1+2+4=7.

    Find missing number
    double ans = totalsum - currentsum;
    print(ans);
    6−7−1.
    This result is wrong because the formula should use n+1 (since the array length is n, but the full range is 0..n).

##