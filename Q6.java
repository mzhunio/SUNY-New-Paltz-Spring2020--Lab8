public class Q6 {
    public static void main(String[] args) {

        String r = substringFrom("Michelle", 2);

        System.out.println(r);
    }
    public static String substringFrom(String str, int index ){
        if (index >= str.length() || index < 0){
            System.out.println("Out of bonds: " + index);
            return "";
        } else {
            return str.substring(index);
        }
    }
}
