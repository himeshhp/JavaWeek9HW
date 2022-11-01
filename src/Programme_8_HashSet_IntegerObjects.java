import java.util.HashSet;
import java.util.Set;

public class Programme_8_HashSet_IntegerObjects {
    public static void main(String[] args) {
        Programme_8_HashSet_IntegerObjects obj = new Programme_8_HashSet_IntegerObjects();
        obj.hasSet();
    }

    public void hasSet(){
        Set<Integer> number = new HashSet();
        number.add(4);
        number.add(7);
        number.add(8);

        for (int i = 1; i <= 10; i++) {
            if (number.contains(i)) {
                System.out.println(i + " is in the set");
            } else {
                System.out.println(i + " is not in the set");
            }
        }
    }
}