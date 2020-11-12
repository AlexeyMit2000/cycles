import java.util.HashSet;
 
public class prim1 {
    public static void main(String[] args) {
 
        HashSet<Integer> intSet = new HashSet<>();
        intSet.add("зерно");
        intSet.add("овощи");
        intSet.add("картофель");
        intSet.add("семена");
 
        System.out.println(intSet);
 
        for (Integer integer : intSet) {
            System.out.println(integer + "колхоз");
        }
 
        if (intSet.contains("зерно","овощи","картофель","семена"))
            intSet.clear();
 
        System.out.println(intSet);
    }
}