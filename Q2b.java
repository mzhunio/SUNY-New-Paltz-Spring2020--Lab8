import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Q2b {

    public static void main(String[] args) {

        ArrayList<Double> numbers = new ArrayList<>();

        int n = 5;
        for (int i = 0; i < n; i++) {
            double number = random(0, 100);
            numbers.add(number);
        }

        double sum = sum(numbers);
        double average = average(numbers);
        ArrayList<Double> newNumbers = deleteGreaterThanAverage(numbers);



        System.out.println(numbers);
        System.out.println(newNumbers);
        System.out.println(sum);
        System.out.println(average);

    }

    private static ArrayList<Double> deleteGreaterThanAverage(ArrayList<Double> numbers){
        ArrayList<Double> newNumbers = new ArrayList<>();
        double average = average(numbers);

        for (double number: numbers) {
            if (number <= average){
                newNumbers.add(number);
            }
        }

        return newNumbers;
    }

    private static double average(ArrayList<Double> numbers){
        return sum(numbers) / numbers.size();
    }

    private static double sum(ArrayList<Double> numbers) {
            double sum = 0;
            for (int i = 0; i < numbers.size(); i++) {
                sum = sum + numbers.get(i);
            }
        return sum;
    }

    public static double random(int min, int max) {
        return min + (max - min) * Math.random();
    }

}






