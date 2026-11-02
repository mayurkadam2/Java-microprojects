# 01 – Basic Calculator

## 1. Scenario

A basic calculator is required to perform arithmetic calculations through a console interface. The calculator accepts two numbers and an arithmetic operator, performs the requested operation, and displays the result.

The calculator must correctly handle invalid operators, division by zero, and invalid numeric input.

## 2. Problem Description

Write a Java program that implements a basic arithmetic calculator.

Your program must satisfy the following requirements:

1. **Input Numbers**
   - Accept two numeric values from the user.
   - Both values may be positive, negative, or decimal numbers.
   - Zero must be accepted as a valid operand.

2. **Arithmetic Operations**

   Support the following four operations:

   | Operator | Operation |
   |---|---|
   | `+` | Addition |
   | `-` | Subtraction |
   | `*` | Multiplication |
   | `/` | Division |

3. **Operation Selection**
   - Accept one arithmetic operator from the user.
   - Perform only the operation corresponding to the supplied operator.
   - Operators other than `+`, `-`, `*`, and `/` must be rejected.

4. **Calculation**
   - Addition must return the sum of both operands.
   - Subtraction must return the difference between the first and second operands.
   - Multiplication must return the product of both operands.
   - Division must divide the first operand by the second operand.

5. **Division by Zero**
   - Division by zero must not be performed.
   - If the second operand is zero and the selected operator is `/`, display an appropriate error message.
   - The program must terminate the current calculation without displaying a numeric result.

6. **Invalid Numeric Input**
   - If either operand is not a valid numeric value, display an error message.
   - The program must not attempt the calculation using invalid input.
   - Handle invalid numeric input without terminating unexpectedly.

7. **Result**
   - Display the calculated result for every valid operation.
   - Preserve negative results and decimal precision.
   - Do not round the result to a fixed number of decimal places.

8. **Program Execution**
   - Perform exactly one calculation per program execution.
   - The program must terminate after displaying the result or an error message.

## 3. Conventions and Hints

1. **Language:** Java
2. **Java Version:** Java 8 or later
3. **Package:** `level01.calculator`
4. **Main Class:** `Calculator`
5. **Entry Point:** `public static void main(String[] args)`
6. Use `Scanner` for console input.
7. Use `System.out` for console output.
8. Use appropriate primitive data types for numeric operands.
9. Use conditional statements or a `switch` statement for operation selection.
10. Basic exception handling is allowed for invalid numeric input.

### Restrictions

- Console-based application only.
- GUI libraries such as Swing and JavaFX are not allowed.
- Graphics, external libraries, and frameworks are not allowed.
- Database and file storage are not allowed.
- Additional arithmetic operations such as modulus, exponentiation, and square root are not allowed.

## 4. Input/Output Specification

### Input Format

The program accepts three inputs in the following order:

1. First number
2. Operator
3. Second number

### Output Format

For valid calculations:

```text
Result: <calculated_value>
```

For invalid operators:

```text
Error: Invalid operator.
```

For division by zero:

```text
Error: Division by zero is not allowed.
```

For invalid numeric input:

```text
Error: Invalid numeric input.
```

### Input Validation Rules

- If the first operand is invalid, terminate without requesting further inputs.
- If the operator is invalid, terminate without requesting the second operand.
- If the second operand is invalid, terminate without performing the calculation.
- If division by zero is attempted, display the specified error message.
- Each execution must produce either one numeric result or one error message.

## 5. Test Cases

### Test Case 1: Addition of Positive Integers

**Input:**
```text
10
+
20
```

**Expected Output:**
```text
Result: 30.0
```

### Test Case 2: Subtraction Resulting in a Negative Number

**Input:**
```text
10
-
25
```

**Expected Output:**
```text
Result: -15.0
```

### Test Case 3: Multiplication

**Input:**
```text
12
*
5
```

**Expected Output:**
```text
Result: 60.0
```

### Test Case 4: Division with Decimal Result

**Input:**
```text
10
/
4
```

**Expected Output:**
```text
Result: 2.5
```

### Test Case 5: Division by Zero

**Input:**
```text
15
/
0
```

**Expected Output:**
```text
Error: Division by zero is not allowed.
```

### Test Case 6: Negative Operands

**Input:**
```text
-10
*
-5
```

**Expected Output:**
```text
Result: 50.0
```

### Test Case 7: Decimal Operands

**Input:**
```text
12.5
+
7.25
```

**Expected Output:**
```text
Result: 19.75
```

### Test Case 8: Zero as First Operand

**Input:**
```text
0
+
15
```

**Expected Output:**
```text
Result: 15.0
```

### Test Case 9: Invalid Operator

**Input:**
```text
10
%
5
```

**Expected Output:**
```text
Error: Invalid operator.
```

### Test Case 10: Invalid First Operand

**Input:**
```text
abc
```

**Expected Output:**
```text
Error: Invalid numeric input.
```

### Test Case 11: Invalid Second Operand

**Input:**
```text
10
+
hello
```

**Expected Output:**
```text
Error: Invalid numeric input.
```

### Test Case 12: Division of Negative and Positive Numbers

**Input:**
```text
-15
/
4
```

**Expected Output:**
```text
Result: -3.75
```

### Test Case 13: Division of Two Negative Numbers

**Input:**
```text
-20
/
-4
```

**Expected Output:**
```text
Result: 5.0
```

### Test Case 14: Very Small Decimal Values

**Input:**
```text
0.001
*
0.002
```

**Expected Output:**
```text
Result: 0.000002
```

---

**End of Problem Statement**