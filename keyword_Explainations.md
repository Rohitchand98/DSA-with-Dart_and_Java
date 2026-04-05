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

## 