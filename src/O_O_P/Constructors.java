package O_O_P;

public class Constructors {
    public static void main(String[] args) {
        students[] students = new students[5];
        String[] name = new String[5];
        int[] marks =  new int[5];


        O_O_P.students kunal  = new students(15,"Kunal", 85);
        O_O_P.students rahul = new students();
     /*   kunal.name = "Amogh";
        kunal.rno = 13;
        kunal.marks = 87;*/


      /* kunal.changename("Bro");
        kunal.greeting();*/

        System.out.println(kunal.name);
        System.out.println(kunal.marks);
        System.out.println(kunal.rno);

        students random = new students(kunal);
        System.out.println(random.name);

        students random2 = new students();
        System.out.println(random2.name);

    }

}
class students {
    int rno;
    String name;
    int marks;

    void greeting(){

        System.out.println("Hello my name is " + name);
    }

    void changename(String newName){
        name = newName;
    }
    //we need a way to add the values of the above properties
    //object by object


    //CONSTRUCTOR OVERLOADING

    students(students other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    students(){
        //this is how you call a constructor from another constructor
        //internally: new Student
        this(13,"Superman",69);

    }
     //Student arpit = new Student(17, "Arpit", 89.7f);
     // Here, "this" will be replaced with arpit
     students(int rno, String name, int marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;

    }

}




