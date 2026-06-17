public class marks {
    // New Use Of Constructor that every object have their own properties as every Student have their own
    // subjects marks
    public static class StudentData {
        String Name ;
        int Roll;
        int[] marks;
        StudentData(int[] marks){
        this.marks = marks;

        }
    }

    static void main() {
        int[] Arr={1,2,3,4,5};
        //    we also can pass array into constructor
        StudentData S1 = new StudentData(Arr);
        // it makes a shalow copy of Array
         S1.marks[0]=9;
        System.out.println(Arr[0]);



    }

}
