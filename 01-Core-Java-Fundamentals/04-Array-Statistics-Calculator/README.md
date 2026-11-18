# 04 – Array Statistics Calculator

## 1. Scenario

You are developing a simple statistical calculator that processes a collection of integers entered by a user.

The program must calculate basic statistical values from the given numbers and display the results. It must also handle duplicate values, negative numbers, and invalid input.

## 2. Problem Description

Write a Java console application that accepts an array of integers and calculates its statistical properties.

Your program must satisfy the following requirements:

1. Array Input
   - Ask the user to enter the number of elements (`N`).
   - Accept exactly `N` integer values from the user.
   - Store all values in an integer array.
   - `N` must be between 1 and 100, inclusive.
   - If `N` is outside this range or is not a valid integer, display an appropriate error message and terminate the program.
2. Sum
   - Calculate the sum of all elements in the array.
   - The sum must be calculated using a data type that can accommodate the sum of 100 valid Java integers.
3. Average
   - Calculate the arithmetic mean of all array elements.
   - Display the average with exactly two digits after the decimal point.
4. Minimum and Maximum
   - Find the smallest element in the array.
   - Find the largest element in the array.
   - Duplicate values must not affect the correctness of these results.
5. Even and Odd Count
   - Count the total number of even elements.
   - Count the total number of odd elements.
   - Zero must be considered an even number.
   - Negative even and odd integers must be classified correctly.
6. Positive, Negative, and Zero Count
   - Count the number of positive elements.
   - Count the number of negative elements.
   - Count the number of zero elements.
   - Every array element must belong to exactly one of these three categories.
7. Second Largest Distinct Element
   - Find the second-largest distinct value in the array.
   - Duplicate occurrences of the largest value must not be considered separate values.
   - If the array contains fewer than two distinct values, display `Not Available`.
8. Input Validation
   - Every array element must be a valid Java integer.
   - If an element is not a valid integer or is outside the Java `int` range, display an error message and terminate the program.
   - Do not process partially entered arrays.
9. Output
   - Display all calculated statistics.
   - Each statistic must be displayed with its corresponding label.
   - If the second-largest distinct element does not exist, display `Not Available` instead of a number.

## 3. Conventions and Hints

1. Package name: `arraystatisticscalculator`
2. Main class: `Main`
3. Java version: Java 8 or later.
4. Use a console-based application only.
5. Use `Scanner` for input and `System.out` for output.
6. Use an integer array to store the input values.
7. You may create additional methods to perform individual calculations.
8. Do not use:
   - Collections such as `ArrayList`, `HashSet`, `HashMap`, or `LinkedList`.
   - Streams or lambda expressions.
   - External libraries or frameworks.
   - GUI components or graphics.
   - Database or file storage.
9. Do not use built-in sorting methods to calculate the statistics.
10. Do not hardcode the array values.

## 4. Input/Output Specification

Input format

The program accepts:

- First line: Integer `N`, representing the number of elements.
- Next `N` lines: One integer per line.

Output format

Display the following statistics in this order:

```
Sum: <sum>
Average: <average>
Minimum: <minimum>
Maximum: <maximum>
Even Count: <even_count>
Odd Count: <odd_count>
Positive Count: <positive_count>
Negative Count: <negative_count>
Zero Count: <zero_count>
Second Largest Distinct: <value or Not Available>
```

Invalid input behavior

- Invalid `N`: Display `Invalid array size.` and terminate.
- Non-integer or out-of-range array element: Display `Invalid array element.` and terminate.
- No statistical results should be displayed if input validation fails.

## 5. Test Cases

### Test Case 1: Normal positive and negative values

Input

```
6
10
20
30
40
50
60
```

Expected Output

```
Sum: 210
Average: 35.00
Minimum: 10
Maximum: 60
Even Count: 6
Odd Count: 0
Positive Count: 6
Negative Count: 0
Zero Count: 0
Second Largest Distinct: 50
```

### Test Case 2: Negative numbers and zero

Input

```
7
-10
-5
0
5
10
-20
15
```

Expected Output

```
Sum: -5
Average: -0.71
Minimum: -20
Maximum: 15
Even Count: 4
Odd Count: 3
Positive Count: 3
Negative Count: 3
Zero Count: 1
Second Largest Distinct: 10
```

### Test Case 3: Duplicate maximum values

Input

```
6
10
50
50
20
30
50
```

Expected Output

```
Sum: 210
Average: 35.00
Minimum: 10
Maximum: 50
Even Count: 4
Odd Count: 2
Positive Count: 6
Negative Count: 0
Zero Count: 0
Second Largest Distinct: 30
```

### Test Case 4: All elements are identical

Input

```
5
7
7
7
7
7
```

Expected Output

```
Sum: 35
Average: 7.00
Minimum: 7
Maximum: 7
Even Count: 0
Odd Count: 5
Positive Count: 5
Negative Count: 0
Zero Count: 0
Second Largest Distinct: Not Available
```

### Test Case 5: Single element

Input

```
1
-25
```

Expected Output

```
Sum: -25
Average: -25.00
Minimum: -25
Maximum: -25
Even Count: 0
Odd Count: 1
Positive Count: 0
Negative Count: 1
Zero Count: 0
Second Largest Distinct: Not Available
```

### Test Case 6: All zeros

Input

```
4
0
0
0
0
```

Expected Output

```
Sum: 0
Average: 0.00
Minimum: 0
Maximum: 0
Even Count: 4
Odd Count: 0
Positive Count: 0
Negative Count: 0
Zero Count: 4
Second Largest Distinct: Not Available
```

### Test Case 7: Negative values with duplicates

Input

```
5
-10
-20
-10
-30
-20
```

Expected Output

```
Sum: -90
Average: -18.00
Minimum: -30
Maximum: -10
Even Count: 5
Odd Count: 0
Positive Count: 0
Negative Count: 5
Zero Count: 0
Second Largest Distinct: -20
```

### Test Case 8: Invalid array size (zero)

Input

```
0
```

Expected Output

```
Invalid array size.
```

### Test Case 9: Invalid array size (greater than 100)

Input

```
101
```

Expected Output

```
Invalid array size.
```

### Test Case 10: Non-integer array element

Input

```
4
10
20
abc
40
```

Expected Output

```
Invalid array element.
```

### Test Case 11: Integer outside Java int range

Input

```
3
10
2147483648
30
```

Expected Output

```
Invalid array element.
```

### Test Case 12: Integer boundary values

Input

```
3
-2147483648
0
2147483647
```

Expected Output

```
Sum: -1
Average: -0.33
Minimum: -2147483648
Maximum: 2147483647
Even Count: 2
Odd Count: 1
Positive Count: 1
Negative Count: 1
Zero Count: 1
Second Largest Distinct: 0
```