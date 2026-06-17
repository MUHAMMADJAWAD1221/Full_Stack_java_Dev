class BankAccount1{
    private double balance;
    BankAccount1(){

    }
    void deposit(int cash){
        balance+=cash;

    }
    void withDraw(int cash){
        balance-=cash;

    }
    void Checkbalance(){
        System.out.println(" available balance is "+ balance);

    }
}
public class BankAccount {
    static void main(String[] args) {
        BankAccount1 B1= new BankAccount1();
        B1.deposit(56);
        B1.Checkbalance();
        B1.withDraw(10);
        B1.Checkbalance();
       B1.deposit(5);
       B1.Checkbalance();

    }
}
