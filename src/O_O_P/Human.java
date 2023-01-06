package O_O_P;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    //PLEASE REFER MAIN CLASS FROM THE PACKAGE

    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        this.population += 1;


    }


}
