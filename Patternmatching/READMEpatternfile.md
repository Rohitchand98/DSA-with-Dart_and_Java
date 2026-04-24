## Pattern matching algorithm

# Needed to Know before pattern matching coding:
    1. print()- it print the items in column( help to move in next line).

        for (int i = 0; i < n; i++) {
        print(" * ");
        }
        This code will print * in Column    *
                                            *
                                            *
                                            *
                                            *
                                            
    2. stdout.write - it print the items in row. 

        for (int i = 0; i < n; i++) {
        stdout.write(" * ");
        }. 
        This code print * in Row ( *  *  *  *  * )

    3. int n is the limit of the item to print and form a pattern

    4. 
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

# how to make Buttom to top and top to buttom
## Bottom‑Left Triangle
    Outer loop (i) → controls the number of rows. It runs from 1 to n.
    Inner loop (j) → prints stars in each row. For row i, it prints i stars.
    Result: Each new row has one more star than the previous, forming a right‑angled triangle aligned to the bottom‑left corner.
    Example (n = 5):

## Top‑Left Triangle

    Outer loop (i) → starts at n and decreases down to 1.
    Inner loop (j) → prints stars equal to the current row number i.
    Result: The first row prints n stars, and each subsequent row prints one fewer, forming a right‑angled triangle aligned to the top‑left corner.

    🔹 Key Difference
    Bottom‑Left: Builds upward, increasing stars per row.
    Top‑Left: Builds downward, decreasing stars per row.

## Prints both top-to-bottom and bottom-to-top pyramids

    Let’s carefully walk through the **Top-to-Bottom Pyramid code** you wrote earlier so you fully understand how it works:
### Step-by-Step Explanation

    1. **Outer loop (`i`) → controls the row number**
    - Runs from `1` to `rows`.
    - Each iteration prints one line of the pyramid.

    2. **First inner loop (`j`) → prints spaces**
    - For row `i`, it prints `(rows - i)` spaces.
    - This centers the stars so the pyramid looks symmetric.
    - Example:  
        - Row 1 → 4 spaces  
        - Row 2 → 3 spaces  
        - Row 5 → 0 spaces  

    3. **Second inner loop (`k`) → prints stars**
    - Prints `(2 * i - 1)` stars.
    - This ensures the star count grows as odd numbers: 1, 3, 5, 7, 9.
    - Example:  
        - Row 1 → 1 star  
        - Row 2 → 3 stars  
        - Row 5 → 9 stars  

    4. **`print("")` → moves to the next line**
    - After spaces + stars are printed, this starts a new line for the next row.

    🔎 Why It Works
    - Spaces push stars to the center.
    - Stars grow in odd numbers, forming the pyramid shape.
    - Outer loop ensures the pyramid builds row by row.

    Alright Rohit, let’s break down the **Bottom-to-Top pyramid code** (the inverted pyramid) so you see how it works compared to the top-to-bottom one:

    Step-by-Step Explanation

    1. **Outer loop (`i`) → controls row count**
    - Starts from `rows` and decreases down to `1`.
    - This makes the pyramid shrink row by row.

    2. **First inner loop (`j`) → prints spaces**
    - For each row, it prints `(rows - i)` spaces.
    - As `i` decreases, spaces increase, pushing stars inward.
    - Example (rows = 5):  
        - Row 5 → 0 spaces  
        - Row 4 → 1 space  
        - Row 1 → 4 spaces  

    3. **Second inner loop (`k`) → prints stars**
    - Prints `(2 * i - 1)` stars.
    - As `i` decreases, stars reduce in odd numbers: 9, 7, 5, 3, 1.
    - Example:  
        - Row 5 → 9 stars  
        - Row 4 → 7 stars  
        - Row 1 → 1 star  

    4. **`print("")` → moves to next line**
    - Ensures each row prints on a new line.

    ### 🔎 Why It Works
    - The outer loop runs in reverse, so the pyramid shrinks.
    - Spaces increase as stars decrease, giving the inverted pyramid shape.


## 



