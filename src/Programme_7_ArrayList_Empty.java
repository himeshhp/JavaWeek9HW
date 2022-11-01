import java.util.ArrayList;

public class Programme_7_ArrayList_Empty {
    public static void main(String[] args) {
        Programme_7_ArrayList_Empty obj = new Programme_7_ArrayList_Empty();
        obj.emptyArrayList();
    }

    public void emptyArrayList() {
        ArrayList<String> tube = new ArrayList();
        tube.add("Central");
        tube.add("Victoria");
        tube.add("Jubilee");
        tube.add("Circle");
        tube.add("Hammersmith and City");
        tube.add("Bakerloo");

        System.out.println(tube.isEmpty());
    }
}

