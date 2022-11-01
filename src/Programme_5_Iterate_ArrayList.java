import java.util.ArrayList;
import java.util.Iterator;

public class Programme_5_Iterate_ArrayList {
    public static void main(String[] args) {
        Programme_5_Iterate_ArrayList obj = new Programme_5_Iterate_ArrayList();
        obj.iterateArray();
    }

    public void iterateArray(){
        ArrayList<Integer> number = new ArrayList();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);
        number.add(7);
        number.add(8);
        number.add(9);
        number.add(10);

        Iterator<Integer> it = number.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

