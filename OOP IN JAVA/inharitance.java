class veichal {
    int speed;
    String type;


}
class BMW extends veichal{
    int topspeed;
    String name;
    void print(){
        System.out.println("type is : "+type);
        System.out.println("speed is "+ speed);
        System.out.println("top speed is : "+ topspeed);
     


    }
    

    }


public class inharitance {
    static void main() {
      BMW M6 = new BMW();
      M6.name=" Bmw M6 COMPITITION ";
      M6.topspeed=300;
      M6.type="super Car";

      M6.print();





    }
}