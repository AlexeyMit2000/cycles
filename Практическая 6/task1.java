import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
 
    public class task1 {
 
    public static void get(String exp, String rem, int res) {
        if (!rem.isEmpty())
            for (int i = 1; i <= rem.length(); i++) {
                String[] parts = {rem.substring(0, i), rem.substring(i)};
                if (exp.isEmpty()) get(parts[0], parts[1], Integer.parseInt(parts[0]));
                else {
                    get(exp + "+" + parts[0], parts[1], res + Integer.parseInt(parts[0]));
                    get(exp + "-" + parts[0], parts[1], res - Integer.parseInt(parts[0]));
                }
            } else if (res == 100) System.out.println(exp);
    }
 
    public static void main(String[] args) {
        get("", "123456789", 0);//возрастающий порядок.
		get("", "987654321", 0);//убывающий порядок.
    }
}