public class Stringpooling {
    public static void main(String[] args) {
        String str1 = new String("Java");
        String str2 = new String("Java");

        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

        String str3 = "Java";
        String str4 = "Java";

        System.out.println(str3 == str4);
        System.out.println(str3.equals(str2));
    }
}
