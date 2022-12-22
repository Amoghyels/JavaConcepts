package O_O_P;

public class Introduction {
    public static void main(String[] args) {

        students[] students = new students[5];
        String[] name = new String[5];
        float[] marks =  new float[5];


        O_O_P.students kunal  = new students();
        kunal.name = "Amogh";
        kunal.rno = 13;
        kunal.marks = 87;

        System.out.println(kunal.name);
        System.out.println(kunal.marks);
        System.out.println(kunal.rno);


    }

}
class Student{
    int rno;
    String name;
    int marks;



}


