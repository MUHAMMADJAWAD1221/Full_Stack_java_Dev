package Collection;

import java.util.ArrayList;

public class Arrayllist {
    static void main(String[] args) {
        ArrayList<Integer> L1 = new ArrayList<>();
        L1.add(6);
        L1.add(3);
        L1.add(5);
        L1.add(7);
        System.out.println(L1);

        System.out.println(L1.get(2));
        for (int i = 0; i < L1.size(); i++) {
            System.out.println(L1.get(i));

        }
    }
}

