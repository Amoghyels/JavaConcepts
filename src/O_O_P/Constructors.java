package O_O_P;

public class Constructors {
    public static void main(String[] args) {
        students[] students = new students[5];
        String[] name = new String[5];
        float[] marks =  new float[5];


        O_O_P.students kunal  = new students();
     /*   kunal.name = "Amogh";
        kunal.rno = 13;
        kunal.marks = 87;*/

       kunal.greeting();

        /* System.out.println(kunal.name);
        System.out.println(kunal.marks);
        System.out.println(kunal.rno);*/


    }

}
class students {
    int rno;
    String name;
    int marks;

    void greeting(){
        System.out.println("Hello my name is " + name);
    }
    //we need a way to add the values of the above properties
    //object by object

    students(){
        this.rno = 13;
        this.name = "Kunal kushwaha";
        this.marks = 88;

    }

}




