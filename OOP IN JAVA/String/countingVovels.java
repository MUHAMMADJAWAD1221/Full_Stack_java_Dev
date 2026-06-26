package String;

import java.util.Scanner;

public class countingVovels {
    static void main(String[] args) {
       Scanner input = new Scanner(System.in);
     String a = "aaeeiioouupmkonjihbugvyftcrdxeszwaqqazwsxedcrfvtgbyhnujmiko";
        int count = 0;
        for (int i = 0; i<a.length();i++){

         char ch = a.charAt(i);
         if (ch == 'a' || ch== 'e' ||ch== 'i' || ch=='o' ||ch== 'u'){
         count++;

         }
       
     }
        System.out.println(count);

    }
}
