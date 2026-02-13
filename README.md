[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/5b1cY4KM)
# Experiment 52: Multiple Catch Blocks (Array/Arithmetic)

## Problem Statement

Write a program that takes an array size $N$ and $N$ integers. Then it takes an index and a divisor.
Perform division of the element at the specified index by the divisor.

Handle the following exceptions:
1.  **`ArrayIndexOutOfBoundsException`**: If the accessed index is invalid, print "Invalid Index".
2.  **`ArithmeticException`**: If the divisor is zero, print "Divide by zero error".

## Input Format

* Line 1: $N$ (Array size).
* Line 2: $N$ space-separated integers (Array elements).
* Line 3: Index to access.
* Line 4: Divisor.

## Output Format

* The result of the division, OR the specific error message.

### Example 1

**Input:**

```text
3
10 20 30
1
0
```

**Output:**

```text
Divide by zero error
```

### Example 2

**Input:**

```text
3
10 20 30
5
2
```

**Output:**

```text
Invalid Index
```
