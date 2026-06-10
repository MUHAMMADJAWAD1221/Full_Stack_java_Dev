public class Constructor {
    static class Car{
        String Name;
        int Sets;
        Car(String Name,int Sets){
            Name = Name;
          Sets = Sets;
        }
        Car () {

        }
        Car(int S ,String N){
// for order matters if user don't enter titles as constructor wants and for avoiding Exceptions or Error
//also constructoe will be uses according to the order
            Sets = S;
            Name = N;

        }

        void print(){
            System.out.println(Name+" "+Sets);
        }


    }
   public static void main() {
    Car C1 = new Car("Kia Sonet\n", 4);
    C1.print();
        Car C2 = new Car(5,"BMW");
        C2.print();
        Car C3=new Car();
        C3.Name="jhghjk";



    }
}