import org.apache.commons.lang3.StringUtils;
public class Main {
    public static String reverseString(String str) {
        return StringUtils.reverse(str);
    }
    public static String stringFromArray(String[] str) {
         String joinedString = Arrays.toString(strArray);
         StringUtils.deleteWhitespaces(joinedString);
        return joinedString;
    }
    public static void main(String[] args) {
        /* System.out.println(reverseString("Tak")); */
    }   System.out.println(stringFromArray(String[] str {"Iam", "curious" , "is", "it", "gonna", "work"));
}
