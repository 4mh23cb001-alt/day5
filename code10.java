public class code10{
    public static void main(String[] args) {
        int[] numbers = {45, 12, 89, 7, 56, 3, 91};
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Array: " + java.util.Arrays.toString(numbers));
        System.out.println("Minimum Element: " + min);
        System.out.println("Maximum Element: " + max);
    }
}

