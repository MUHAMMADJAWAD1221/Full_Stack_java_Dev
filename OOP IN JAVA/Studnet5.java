class Student2{
    private String name ;
    private int age ;
    Student2(int age , String name){
        this.name=name;
        this.age=age;

    }
    Student2(String name , int age){
        this.name=name;
        this.age=age;

    }
    String getName(){
       return name;
    }
    void setName(String Name){
        this.name = name;

    }
    void setAge(int age){
        if(age>=0){
            this.age = age;

        }
        else{
            System.out.println("Value is negative Cant be save ");

        }

        }

    void Displayinfo(){
        System.out.println(" Name is : "+ name+" age is : "+ age );

    }



}

public class Studnet5 {
    static void main(String[] args) {
        Student2 S1 = new Student2(18, "aslam");
        S1.setName(" CHATGPT");
        S1.getName();
        S1.setAge(6);
        S1.Displayinfo();



    }
}
