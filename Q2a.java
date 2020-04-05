import java.util.ArrayList;

public class Q2a {

    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();

        int n = 5;
        for(int i = 0; i < n; i++){
            double number = random(0,100);
            numbers.add(number);
        }
        
        System.out.println(numbers);
    }
    public static double random (int min, int max ){
        return min + (max - min) * Math.random();
    }

}
