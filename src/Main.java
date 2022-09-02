import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Задача 1
        int[] numbers = new int[]{1, 2, 3};
        double[] doubles = {1.57, 7.654, 9.986};
        String[] custom = {"Apple", "Orange", "Cucumber"};


        //Задание 2
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (double x = 0; x < doubles.length; x++) {
            System.out.println(doubles[(int) x]);
        }

        for (char q = 0; q < custom.length; q++) {
            System.out.println(custom[q]);
        }

        //Задание 3

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
        for (int x = doubles.length - 1; x >= 0; x--) {
            System.out.println(doubles[x]);
        }
        for (int q = custom.length - 1; q >= 0; q--) {
            System.out.println(custom[q]);
        }

        //Задание 4

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] = numbers[i] + 1;
            }
            System.out.println(numbers[i]);
        }
    }
}