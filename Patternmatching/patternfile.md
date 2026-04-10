## Pattern matching algorithm
# Step-by-Step Explanation of Hollow Triagle 
    int rows = 5;
    This sets the height of the pyramid. You’ll get 5 rows of stars.
    Outer loop (for (int i = 1; i <= rows; i++))
    Controls the number of rows.
    Each iteration prints one row of the pyramid.
    First inner loop (for (int j = i; j < rows; j++))
    Prints spaces before the stars.
    This centers the pyramid by pushing stars to the right.
    Example: On row 1, it prints 4 spaces; on row 2, 3 spaces, etc.
    Second inner loop (for (int k = 1; k <= (2 * i - 1); k++))
    Prints the actual stars and spaces inside the pyramid.
    (2 * i - 1) ensures the pyramid widens symmetrically (1, 3, 5, 7, …).
    Condition (if (k == 1 || k == (2 * i - 1) || i == rows))
    Prints * at the first position, last position, and entire bottom row.
    Everywhere else, it prints a space to make the pyramid hollow.
    print('');
    Moves to the next line after finishing one row.

#  How to make Square
    Explanation:

    for (int i = 0; i < n; i++) → runs n times for rows.
    for (int j = 0; j < n; j++) → runs n times for columns in each row.
    stdout.write("* ") → prints stars side by side without line breaks.
    print("") → moves to the next line after each row.