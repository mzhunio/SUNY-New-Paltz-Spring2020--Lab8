public class Q3a {
    public static void main(String[] args) {
        String result = remove("Michelle", "Michelle123");

        System.out.println(result);
    }
    public static String remove (String subString, String from) {

        int first = from.indexOf(subString);
        int last = first + subString.length();

        return from.substring(0, first) + from.substring(last);
    }

}
