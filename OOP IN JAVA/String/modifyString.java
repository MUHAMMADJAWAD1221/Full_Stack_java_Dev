package String;
// modify the String if the First letter is Capital make all latters of the
// string capital if make all laters capital
public class modifyString {
    public void StringModify(String str){
        if (Character.isUpperCase(str.charAt(0))){
            System.out.println(str.toUpperCase());
        }
        else {
            System.out.println(str.toLowerCase());
        }
    }
    static void main(String[] args) {
        modifyString a = new modifyString();
        a.StringModify("aBCD");
    }
}
