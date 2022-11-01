import java.util.ArrayList;

public class Programme_6_Retrieve_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList();
        a.add(101);
        a.add(202);
        a.add(303);
        a.add(404);
        a.add(505);

        System.out.println(a);

        Integer b = a.get(0);
        System.out.println("First element: " + b);
        b = a.get(2);
        System.out.println("Third element: " + b);
    }
}

