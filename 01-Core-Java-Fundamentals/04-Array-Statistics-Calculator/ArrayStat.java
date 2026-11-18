import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayStat {
    private final Scanner sc;
    private int[] array;
    int N;

    long sum;
    double avg;
    int min;
    int max;
    int evenCount;
    int oddCount;
    int positiveCount;
    int negativeCount;
    int zeroCount;
    int secondLarge = Integer.MIN_VALUE;

    ArrayStat(Scanner sc) {
        this.sc = sc;
    }

    long sum(int[] arr) {
        sum = 0;
        for (int x : arr)
            sum += x;
        return sum;
    }

    int min(int[] arr) {
        int min = arr[0];
        for (int x : arr) {
            if (x < min)
                min = x;
        }
        return min;
    }

    int max(int[] arr) {
        int max = arr[0];
        for (int x : arr) {
            if (x > max)
                max = x;
        }
        return max;
    }

    int evenCount(int[] arr) {
        int count = 0;
        for (int x : arr)
            if (x % 2 == 0 && x != 0)
                count++;
        return count;
    }

    int oddCount(int[] arr) {
        int count = 0;
        for (int x : arr)
            if (x % 2 != 0)
                count++;
        return count;
    }

    int positiveCount(int[] arr) {
        int count = 0;
        for (int x : arr)
            if (x > 0)
                count++;
        return count;
    }

    int negativeCount(int[] arr) {
        int count = 0;
        for (int x : arr)
            if (x < 0)
                count++;
        return count;
    }


    int secondLargestDistinct(int[] arr) {
        int largest = Integer.MIN_VALUE;
        
        for (int x : arr) {
            if (x > largest) {
                secondLarge = largest;
                largest = x;
            } else if (x > secondLarge && x != largest) {
                secondLarge = x;
            }
        }
        return secondLarge;
    }

    public void countStatistics() {
        sum = sum(array);
        avg = (double) sum / N;
        min = min(array);
        max = max(array);
        evenCount = evenCount(array);
        oddCount = oddCount(array);
        positiveCount = positiveCount(array);
        negativeCount = negativeCount(array);
        zeroCount = Math.abs(N - evenCount - oddCount);
        secondLarge = secondLargestDistinct(array);

    }

    void showResult() {
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Even Count: " + evenCount);
        System.out.println("Odd Count: " + oddCount);
        System.out.println("Positive Count: " + positiveCount);
        System.out.println("Negative Count: " + negativeCount);
        System.out.println("Zero Count: " + zeroCount);
        System.out.println("Second Largest Distinct: " + ((secondLarge == Integer.MIN_VALUE)?"NOT AVAILABLE":secondLarge));

    }

    public void getElements() {
        try {
            System.out.print("Enter (Number) of elements N: ");

            N = sc.nextInt();

            if (N > 100 || N < 1) {
                System.out.println("The Range of the Elements is [1 , 100]");
                System.out.println("Try Again");
            } else {
                array = new int[N];
                System.out.println("Enter Elements  ");
                sc.nextLine();
                for (int i = 0; i < N; i++) {
                    array[i] = sc.nextInt();
                }

                countStatistics();
                showResult();
            }

        } catch (InputMismatchException e) {
            System.out.println("Enter Valid Values");
        }
    }

}
