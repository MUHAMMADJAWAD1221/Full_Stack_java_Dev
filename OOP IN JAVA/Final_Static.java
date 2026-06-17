 class crictor{
    /* for accesing from any where and finalise for each object that value cant be change in the code we use static */
   static String country = "Pakistan";
    int avg;
    String name;


}
public class Final_Static {
    static void main(String[] args) {
       crictor ct=new crictor();
       crictor cz = new crictor();
       ct.country = "india";
        System.out.println(cz.country);



        }
    }



