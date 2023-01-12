import org.apache.commons.lang3.StringUtils;
import java.util.Arrays;

public class Main {
    public static String stringFromArray(String[] str) {
         String joinedString = Arrays.toString(str);
        return joinedString;
    }
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(stringFromArray(cars));
    }
}

