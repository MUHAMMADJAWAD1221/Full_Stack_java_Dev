package String;
public class StringBuilderMethods {
    static void main(String[] args) {
        String s = "456789";
        StringBuilder str = new StringBuilder(s);
        str.deleteCharAt(3);
        System.out.println(s);
        System.out.println(str);
        str.insert(3,7);
        System.out.println(str);
        //delete from i to j ==>
        str.delete(0,3);
        System.out.println(str);



    }
}