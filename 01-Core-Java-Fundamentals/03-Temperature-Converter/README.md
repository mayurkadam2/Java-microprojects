# Project 03 – Temperature Converter

Level: 01 – Core Java Fundamentals

## 1. Scenario

A weather enthusiast frequently works with temperature readings expressed in different units. They need a simple console-based program that converts temperatures between Celsius, Fahrenheit, and Kelvin.

Your task is to develop a temperature converter that accepts a temperature value and its unit, then converts it into the other two temperature units.

## 2. Problem Description

Implement a Java program that satisfies the following requirements:

1. The program must accept a temperature value and its original unit from the user.
2. The program must support exactly three temperature units:
   - Celsius (`C`)
   - Fahrenheit (`F`)
   - Kelvin (`K`)
3. Convert the entered temperature into the other two units using the standard temperature conversion formulas.
4. The conversion formulas must follow these definitions:
   - Celsius to Fahrenheit: \\(F = (C \times 9/5) + 32\\)
   - Celsius to Kelvin: \\(K = C + 273.15\\)
   - Fahrenheit to Celsius: \\(C = (F - 32) \times 5/9\\)
   - Fahrenheit to Kelvin: \\(K = (F - 32) \times 5/9 + 273.15\\)
   - Kelvin to Celsius: \\(C = K - 273.15\\)
   - Kelvin to Fahrenheit: \\(F = (K - 273.15) \times 9/5 + 32\\)
5. A temperature below absolute zero must be rejected:
   - Celsius: less than `-273.15`
   - Fahrenheit: less than `-459.67`
   - Kelvin: less than `0`
6. A temperature exactly equal to absolute zero must be accepted.
7. The unit input must be case-insensitive. For example, `c`, `C`, `f`, and `F` must be accepted.
8. If the user enters an unsupported unit, the program must display an appropriate error message instead of performing the conversion.
9. If the temperature input is not a valid numeric value, the program must display an appropriate error message.
10. The program must not perform any conversion when the temperature is below absolute zero or when the input unit is invalid.
11. The program must display both converted temperatures along with their corresponding unit symbols.
12. The program must use floating-point arithmetic so that decimal temperature values are supported.

## 3. Conventions and Hints

- Use Java.
- Package name: `level01.project03`.
- Main class name: `Main`.
- The program must be console-based.
- Use `Scanner` for user input and `System.out` for output.
- Use methods to organize the conversion operations.
- Use appropriate conditional statements to identify the input unit.
- Use loops only if required by your implementation.
- Basic exception handling is allowed for invalid numeric input.
- Use `double` for temperature values and calculations.
- Do not use GUI libraries, graphics, databases, frameworks, external libraries, or third-party conversion utilities.
- Do not use menus, persistent storage, or additional temperature units.
- Use `273.15` as the Celsius-to-Kelvin offset.
- Conversion results must be mathematically correct. No specific display precision or rounding format is required.

## 4. Input/Output Specification

Input:

The program must accept two inputs:

1. A numeric temperature value.
2. A temperature unit (`C`, `F`, or `K`).

The inputs can be collected on separate lines.

Output:

For valid input, display the two converted temperatures and their unit symbols.

For invalid input:

- Non-numeric temperature: display `Invalid temperature value.`
- Unsupported unit: display `Invalid temperature unit.`
- Temperature below absolute zero: display `Temperature cannot be below absolute zero.`

After displaying an error, the program must terminate without displaying conversion results.

## 5. Test Cases

### Test Case 1: Celsius to Fahrenheit and Kelvin

Input

```
100
C
```

Expected Output

```
Fahrenheit: 212.0
Kelvin: 373.15
```

### Test Case 2: Fahrenheit to Celsius and Kelvin

Input

```
32
F
```

Expected Output

```
Celsius: 0.0
Kelvin: 273.15
```

### Test Case 3: Kelvin to Celsius and Fahrenheit

Input

```
300
K
```

Expected Output

```
Celsius: 26.85
Fahrenheit: 80.33
```

### Test Case 4: Decimal temperature

Input

```
36.5
C
```

Expected Output

```
Fahrenheit: 97.7
Kelvin: 309.65
```

### Test Case 5: Lowercase unit

Input

```
25
c
```

Expected Output

```
Fahrenheit: 77.0
Kelvin: 298.15
```

### Test Case 6: Absolute zero in Celsius

Input

```
-273.15
C
```

Expected Output

```
Fahrenheit: -459.67
Kelvin: 0.0
```

### Test Case 7: Absolute zero in Fahrenheit

Input

```
-459.67
F
```

Expected Output

```
Celsius: -273.15
Kelvin: 0.0
```

### Test Case 8: Absolute zero in Kelvin

Input

```
0
K
```

Expected Output

```
Celsius: -273.15
Fahrenheit: -459.67
```

### Test Case 9: Temperature below absolute zero

Input

```
-300
C
```

Expected Output

```
Temperature cannot be below absolute zero.
```

### Test Case 10: Unsupported temperature unit

Input

```
100
X
```

Expected Output

```
Invalid temperature unit.
```

### Test Case 11: Non-numeric temperature

Input

```
abc
C
```

Expected Output

```
Invalid temperature value.
```

### Test Case 12: Negative temperature above absolute zero

Input

```
-40
C
```

Expected Output

```
Fahrenheit: -40.0
Kelvin: 233.15
```

### Test Case 13: Zero Celsius

Input

```
0
C
```

Expected Output

```
Fahrenheit: 32.0
Kelvin: 273.15
```