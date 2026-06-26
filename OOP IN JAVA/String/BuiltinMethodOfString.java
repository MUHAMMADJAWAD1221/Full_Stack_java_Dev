package String;


import java.io.PrintStream;
import java.lang.String;
public class BuiltinMethodOfString {
    static void main(String[] args) {
        String str ="helleo";
        String a = "ASDFGHJKQWERTYUIO";


                System.out.println(str.lastIndexOf('e'));
             //  make lower to uper and uper to lowerCase
                System.out.println(str.toUpperCase());
                System.out.println(a.toLowerCase());
           //     conditional check if that exist in the String that must be combined like in Harshit Harsh is combined
          //     just checking that if it works in conditional way
                if (a.contains("QWERT")){
                    System.out.println("happy");

                }
    //    check starts with & ends with
               System.out.println(a.startsWith("ASDF"));
                System.out.println(str.endsWith("eo"));

// check the distance of character in ASCII and also compare String
        System.out.println(str.compareTo(a));
        System.out.println();



    }
}
