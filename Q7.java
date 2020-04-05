public class Q7 {
    public static void main(String[] args) {

        String r = method("Michelle", "lle");

        System.out.println(r);
    }
    public static String method(String a, String b){
        if(a.contains(b)){
            return a + b.toUpperCase();
        } else {
            return "";
        }

    }
}
