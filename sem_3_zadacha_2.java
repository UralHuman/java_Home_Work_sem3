import java.util.ArrayList;
import java.util.Collections;

public class sem_3_zadacha_2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);

        int min = Collections.min(numbers);
        int max = Collections.max(numbers);

        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.size();

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + average);
    }
}