import java.util.ArrayList;
import java.util.Scanner;

public class spoons {
    private static ArrayList<String> names = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            String value = input.next();
            value = value.toLowerCase();

            if (value.equals("stop")) {
                break;
            }
            else {
                names.add(titleCase(value));
            }
        }while (true);

        System.out.println(names);
    }

    private static String titleCase(String input) {
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }
}
