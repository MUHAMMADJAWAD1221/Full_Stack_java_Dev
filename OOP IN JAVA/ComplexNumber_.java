
 class complexNum {
    int x;
    int y;

    void print() {

        if (y>=0) System.out.println(x+"-"+y+"i");
        else    System.out.println(x +"+" +(-y) + "i");

    }

    complexNum(int a, int b) {
        x = a;
        y = b;
    }
  void add(complexNum c) {
        x+=c.x;
        y+=c.y;
     }

    public static class ComplexNumber{
        static void main() {
            complexNum c = new complexNum(2,-5);

            complexNum c1 = new complexNum(3,4);
            c.print();
            c1.print();
            c1.add(c);
            c1.print();
            c.print();
            c1.multi(c);
            c1.print();

        }
    }

     private void multi(complexNum c) {
       x= x*c.x + y*c.y;
         y= x*c.y + y*c.x;


     }


 }