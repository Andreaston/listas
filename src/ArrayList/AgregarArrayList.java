package ArrayList;

import java.util.ArrayList;

public class AgregarArrayList {
    public static void main(String[] args) {
        ArrayList<String> hh = new ArrayList<>();
        hh.add("uno");
        hh.add("DOS");
        hh.add("tres");
        hh.add("cuatro");
        hh.add("cinco");
        System.out.println(hh.add("cuatro"));
        boolean insertar = hh.add("tres");
        System.out.println(hh);
    }
}
