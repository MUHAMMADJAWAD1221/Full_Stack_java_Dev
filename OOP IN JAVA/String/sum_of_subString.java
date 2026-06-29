package String;
public class sum_of_subString {
    //print the sub String
    static void main() {
        String s = "6759";
        int sum=0;
        String sub;
        for (int i =0 ; i<=s.length();i++){
            for (int j=i+1 ;j<=s.length();j++){
                sum+= Integer.parseInt(s.substring(i,j));
            }

        }
        System.out.println(sum);
    }
}



