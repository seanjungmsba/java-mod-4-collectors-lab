import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.stream.Collectors;

class Main {

    // modified this method
    public static long multiplySquaresOfNumbers(List<Integer> numbers) {
        return (long)numbers.stream().map(num -> num*num).reduce(1, (a,b) -> a*b);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            while (true) {
                System.out.print("Enter a list of numbers separated by white space: ");
                String[] values = scanner.nextLine().split(" ");
                List<Integer> numbers = new ArrayList<>();
                for (String val : values) {
                    numbers.add(Integer.parseInt(val));
                }
                long val = multiplySquaresOfNumbers(numbers);
                System.out.println(val);
            }
        } catch (InputMismatchException e) {
            e.getMessage();
            System.err.println("ERROR: Enter valid inputs!");
        }
    }

}