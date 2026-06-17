import java.util.ArrayList;
import java.util.Collections;
public class resisonAll {
    static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList<>();
        s.add(7);
        s.add(2);
        s.add(10);
        s.add(1);
        s.add(5);
        s.add(9);
        s.add(3);
        s.add(8);
        s.add(4);
        s.add(6);
        System.out.println(s);
        Collections.sort(s);
        System.out.println(s);
        //performing other operations
        ArrayList<Integer> a = new ArrayList<>();
        a.addAll(s);
        System.out.println(a);
        boolean see = a.contains(4);
        if (see == true) {
            System.out.println("Exist...");

        } else {
            System.out.println("dont axist ");
        }
        System.out.println(s.size());
        System.out.println(s.isEmpty());
        s.stream()
                .filter(n-> n%2==0)
                .forEach(n-> System.out.println(n));

    }


}