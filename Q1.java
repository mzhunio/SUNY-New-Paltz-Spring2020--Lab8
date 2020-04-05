import java.util.Random;

public class Q1 {
    public static void main(String[] args) {

        final int HEAD = 0;
        final int TAIL = 1;
        final int TOSSES = 10;

        Random random = new Random();
        int [] count = {0,0};

        for(int i = 1; i <= TOSSES; i++){

            int number = random.nextInt(2);

            if(number == HEAD) {
               count[HEAD]++;
            } else {
               count[TAIL]++;
            }
        }
        int heads = count[HEAD];
        int tails = count[TAIL];

        System.out.println("How many tosses? " + TOSSES);

       // System.out.println("HEADS: " + heads);
       // System.out.println("TAILS: " + tails);

        System.out.println("#t\t\t#h\t\t#t");
        System.out.println(TOSSES + "\t\t" + heads + "\t\t" + tails);

    }
}
