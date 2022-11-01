import java.util.ArrayList;

public class Programme_4_ArrayList_Colours {
    public static void main(String[] args) {
        Programme_4_ArrayList_Colours obj = new Programme_4_ArrayList_Colours();
        obj.colourArrayList();
    }

    public void colourArrayList() {
        ArrayList<String> colour = new ArrayList();
        colour.add("Red");
        colour.add("Green");
        colour.add("Orange");
        colour.add("White");
        colour.add("Blue");
        colour.add("Yellow");

        for (String col : colour) {
            System.out.println(col);
        }
    }
}

