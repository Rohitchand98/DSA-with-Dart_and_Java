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