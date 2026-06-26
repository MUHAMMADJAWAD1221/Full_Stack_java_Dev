package String;
import java.lang.String;
import java.util.Scanner;
public class palandromString {
    static void main() {
     Scanner input = new Scanner(System.in);
     String str = "wow";
     String rev = new StringBuilder(str).reverse().toString();

if (str.equals(rev)){
    System.out.println("not a palandrom String ");
}
else {
    System.out.println("palandrom");
  }
    }
}
