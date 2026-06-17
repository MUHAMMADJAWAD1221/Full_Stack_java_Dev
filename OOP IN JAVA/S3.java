import java.util.Scanner;

class S3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
       Student S1=new Student();
        S1.SetName(" jawad");
        System.out.println("Name is : "+S1.GetNmae());
        S1.SetRoll(45);
        System.out.println("Roll number is :  "+S1.GetRoll());
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);





    }

}