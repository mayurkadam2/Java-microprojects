# 02 – Number Guessing Game

Level: 01 – Core Java Fundamentals\
Project: 02 – Number Guessing Game\

## 1. Scenario

A computer generates a secret number within a predefined range. The player must guess the number by entering their guesses through the console.

After every valid guess, the computer provides a hint indicating whether the secret number is higher or lower than the entered guess. The game ends when the player guesses correctly or runs out of attempts.

## 2. Problem Description

Develop a console-based Number Guessing Game that follows these requirements:

1\. Secret Number Generation

- Generate one random integer between 1 and 100, inclusive.
- The generated number must remain unchanged throughout a single game.
- The secret number must not be displayed before the game ends.

2\. Guessing Attempts

- The player gets a maximum of 7 valid attempts.
- Each valid guess must be an integer between 1 and 100, inclusive.
- Every valid guess consumes exactly one attempt.
- Invalid inputs must not consume an attempt.

3\. Guess Evaluation

After receiving a valid guess, evaluate it against the secret number:

- If the guess is smaller than the secret number, display `Too low!`.
- If the guess is greater than the secret number, display `Too high!`.
- If the guess matches the secret number, display `Correct! You guessed the number.`

4\. Winning Condition

- If the player guesses correctly within 7 valid attempts, the game is won.
- Display the total number of valid attempts used.
- Stop accepting further guesses immediately after a correct guess.

5\. Losing Condition

- If the player uses all 7 valid attempts without guessing correctly, the game is lost.
- Display `Game over!`.
- Reveal the secret number after the game ends.

6\. Invalid Input Handling

- If the player enters a non-integer value, display `Invalid input! Enter an integer.`
- If the player enters a number smaller than 1 or greater than 100, display `Out of range! Enter a number between 1 and 100.`
- Invalid inputs must not decrease the remaining attempts.
- The game must continue accepting input after an invalid entry.

7\. Duplicate Guesses

- Repeating a previous guess is allowed.
- Every repeated guess within the valid range consumes one attempt.
- Evaluate duplicate guesses normally.

8\. Game Termination

- The game must terminate after either winning or losing.
- No additional guesses should be accepted after the game ends.

## 3. Conventions and Hints

1. Use Java 8 or later.
2. Use the exact package name:

`level01.numberguessinggame`

3\. Use the main class name:

`NumberGuessingGame`

4. The program must run through the console.
5. Use `Scanner` for reading user input and `System.out` for displaying output.
6. Use Java's built-in random number generation facilities.
7. You may use variables, operators, conditional statements, loops, methods, arrays, strings, and basic exception handling.
8. GUI libraries, graphics, databases, file handling, external libraries, and frameworks are not allowed.
9. Do not use advanced Java features or external random-number libraries.

## 4. Input/Output Specification

### Input

The program accepts user guesses one at a time through standard input.

Each guess is expected to be a single integer.

### Output

- Display a welcome message and the guessing range.
- Display the remaining attempts before each guess.
- Display the appropriate result after each valid guess.
- Display an error message for invalid input.
- Display the final winning or losing message.

The exact welcome-message wording and spacing are not evaluated. The messages specified in the problem description must retain their exact wording.

## 5. Test Cases

Since the secret number is randomly generated, the following test cases use a fixed secret number of 50 for testing purposes only. Your submitted program must still generate its secret number randomly.

### Test Case 1: Correct Guess on First Attempt

Winning case

Secret number: `50`

Input

```
50
```

Expected output

```
Correct! You guessed the number.
Attempts used: 1
```

### Test Case 2: Guess Is Too Low

Secret number: `50`

Input

```
25
50
```

Expected output

```
Too low!
Correct! You guessed the number.
Attempts used: 2
```

### Test Case 3: Guess Is Too High

Secret number: `50`

Input

```
75
50
```

Expected output

```
Too high!
Correct! You guessed the number.
Attempts used: 2
```

### Test Case 4: Invalid Non-Integer Input

Secret number: `50`

Input

```
hello
50
```

Expected output

```
Invalid input! Enter an integer.
Correct! You guessed the number.
Attempts used: 1
```

### Test Case 5: Guess Outside the Range

Secret number: `50`

Input

```
0
101
50
```

Expected output

```
Out of range! Enter a number between 1 and 100.
Out of range! Enter a number between 1 and 100.
Correct! You guessed the number.
Attempts used: 1
```

### Test Case 6: Duplicate Guesses

Secret number: `50`

Input

```
25
25
50
```

Expected output

```
Too low!
Too low!
Correct! You guessed the number.
Attempts used: 3
```

### Test Case 7: Maximum Attempts Exhausted

Secret number: `50`

Input

```
10
20
30
40
45
48
49
```

Expected output

```
Too low!
Too low!
Too low!
Too low!
Too low!
Too low!
Too low!
Game over!
The secret number was: 50
```

### Test Case 8: Correct Guess on the Last Attempt

Boundary case

Secret number: `50`

Input

```
10
20
30
40
45
48
50
```

Expected output

```
Too low!
Too low!
Too low!
Too low!
Too low!
Too low!
Correct! You guessed the number.
Attempts used: 7
```

### Test Case 9: Invalid Inputs Between Valid Guesses

Secret number: `50`

Input

```
20
abc
150
30
50
```

Expected output

```
Too low!
Invalid input! Enter an integer.
Out of range! Enter a number between 1 and 100.
Too low!
Correct! You guessed the number.
Attempts used: 3
```

### Test Case 10: Boundary Values

Secret number: `50`

Input

```
1
100
50
```

Expected output

```
Too low!
Too high!
Correct! You guessed the number.
Attempts used: 3
```

### Test Case 11: Negative Number

Secret number: `50`

Input

```
-5
50
```

Expected output

```
Out of range! Enter a number between 1 and 100.
Correct! You guessed the number.
Attempts used: 1
```

### Test Case 12: Repeated Invalid Inputs

Secret number: `50`

Input

```
abc
xyz
200
50
```

Expected output

```
Invalid input! Enter an integer.
Invalid input! Enter an integer.
Out of range! Enter a number between 1 and 100.
Correct! You guessed the number.
Attempts used: 1
```

End of Problem Statement