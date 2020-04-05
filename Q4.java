public class Q4 {
    public static void main(String[] args) {
        String name = "Michelle";
        int count = count(name);

        System.out.println(count);
    }
    public static int count(String name) {
        int count = 0;
        for (char c : name.toCharArray()) {
            if (c == 'e') {
                count++;
            }
        }
        return count;
    }
}
