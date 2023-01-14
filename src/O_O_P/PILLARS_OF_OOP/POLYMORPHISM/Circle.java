package O_O_P.PILLARS_OF_OOP.POLYMORPHISM;

public class Circle extends Shapes{
    @Override
    //This will run when obj of circle is created
    //hence it is overriding the parent method
    //this is called annotation
    void area()
    {
        System.out.println("Area is pie * r * r ");

    }
}
