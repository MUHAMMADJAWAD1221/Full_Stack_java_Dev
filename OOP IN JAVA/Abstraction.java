interface GPS{
    void navigate();


}
 abstract class vichale {
protected String name ;
protected String Brand;

vichale(String name,String Brand){
    this.name=name;
    this.Brand=Brand;

}

}
class Car extends vichale implements GPS {
    Car(String name, String Brand) {
        super(name, Brand);
    }

    void showDetilas() {
        System.out.println(" name :" + name + "\n" + "Barnd : " + Brand);

    }

    public void Start() {
        System.out.println(" Engine is started");
    }

    @Override
    public void navigate() {
        System.out.println(" car is nevigating through GPS");

    }
}
  public void main(String[] args) {


        Car c = new Car("Grandi","Toyota");
        Car c2 = new Car("swift","suzuki");
        c.showDetilas();
        c.Start();
        c2.showDetilas();
        c2.Start();
        c2.navigate();


    }




